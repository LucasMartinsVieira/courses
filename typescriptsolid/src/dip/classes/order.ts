import { OrderStatus } from './interfaces/order-status';
import { CustomerOrder } from './interfaces/customer-protocol';
import { ShoppingCartProtocol } from './interfaces/shopping-cart-protocol';
import { MessagingProtocol } from './interfaces/messaging-protocol';
import { PersistenceProtocol } from './interfaces/persistence-protocol';

export class Order {
  private _orderStatus: OrderStatus = 'open';

  constructor(
    private readonly cart: ShoppingCartProtocol,
    private readonly messaging: MessagingProtocol,
    private readonly persistence: PersistenceProtocol,
    private readonly customer: CustomerOrder,
  ) {}

  get orderStatus(): OrderStatus {
    return this._orderStatus;
  }

  checkout(): void {
    if (this.cart.isEmpty()) {
      console.log('Your shopping cart is empty');
    }

    this._orderStatus = 'closed';
    this.messaging.sendMessage(
      `Your request with the total of ${this.cart.totalWithDiscount()} has been received`,
    );

    this.persistence.saveOrder();
    this.cart.clear();
    console.log(
      'The client is:',
      this.customer.getName(),
      this.customer.getIDN(),
    );
  }
}
