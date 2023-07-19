import { OrderStatus } from './interfaces/order-status';
import { Messaging } from '../services/messaging';
import { Persistence } from '../services/persistence';
import { ShoppingCart } from './shopping-cart';
import { CustomerOrder } from './interfaces/customer-protocol';

export class Order {
  private _orderStatus: OrderStatus = 'open';

  constructor(
    private readonly cart: ShoppingCart,
    private readonly messaging: Messaging,
    private readonly persistence: Persistence,
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
