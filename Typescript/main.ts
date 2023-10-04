 // Define a product class
 class Product {
    constructor(public id: number, public name: string, public price: number) { }
}

// Sample product data
const products: Product[] = [
    new Product(1, "Product 1", 10.99),
    new Product(2, "Product 2", 19.99),
    new Product(3, "Product 3", 7.99),
];

// Initialize the shopping cart
const cart: Product[] = [];

// Function to display products
function displayProducts() {
    const productsSection = document.getElementById("products");
    productsSection.innerHTML = "";

    products.forEach((product) => {
        const productElement = document.createElement("div");
        productElement.innerHTML = `
            <h3>${product.name}</h3>
            <p>Price: $${product.price.toFixed(2)}</p>
            <button onclick="addToCart(${product.id})">Add to Cart</button>
        `;
        productsSection.appendChild(productElement);
    });
}

// Function to add a product to the cart
function addToCart(productId: number) {
    const product = products.find((p) => p.id === productId);
    if (product) {
        cart.push(product);
        updateCart();
    }
}

// Function to update the shopping cart
function updateCart() {
    const cartItems = document.getElementById("cart-items");
    cartItems.innerHTML = "";

    let total = 0;
    cart.forEach((item) => {
        const cartItemElement = document.createElement("li");
        cartItemElement.textContent = `${item.name} - $${item.price.toFixed(2)}`;
        cartItems.appendChild(cartItemElement);
        total += item.price;
    });

    const cartTotal = document.getElementById("cart-total");
    cartTotal.textContent = total.toFixed(2);
}

// Initialize the app
displayProducts();