type CartItem = { name: string; price: number };
type OrderStatus = 'open' | 'closed';

export class ShoppingCartLegacy {
  private readonly _items: CartItem[] = [];
  private _orderStatus: OrderStatus = 'open';

  addItem(item: CartItem): void {
    this._items.push(item);
  }

  removeItem(index: number): void {
    this._items.splice(index, 1);
  }

  get items(): Readonly<CartItem[]> {
    return this._items;
  }

  get orderStatus(): OrderStatus {
    return this._orderStatus;
  }

  total(): number {
    return +this.items
      .reduce((total, next) => total + next.price, 0)
      .toFixed(2);
  }

  checkout(): void {
    if (this.isEmpty()) {
      console.log('Your shopping cart is empty');
    }

    this._orderStatus = 'closed';
    this.sendMessage(
      `Your request with the total of ${this.total()} has been received`,
    );
    this.saveOrder();
    this.clear();
  }

  isEmpty(): boolean {
    return this._items.length === 0;
  }

  sendMessage(msg: string): void {
    console.log('Message sent: ', msg);
  }

  saveOrder(): void {
    console.log('Successfully saved order');
  }

  clear(): void {
    console.log('Shopping cart has been cleared');
    this._items.length = 0;
  }
}

const shoppingCartLegacy = new ShoppingCartLegacy();
shoppingCartLegacy.addItem({ name: 'Shirt', price: 49.9 });
shoppingCartLegacy.addItem({ name: 'Notebook', price: 9.9 });
shoppingCartLegacy.addItem({ name: 'Pencil', price: 1.59 });
// shoppingCart.clear();

console.log(shoppingCartLegacy.items);
console.log(shoppingCartLegacy.total());
shoppingCartLegacy.checkout();
console.log(shoppingCartLegacy.orderStatus);
