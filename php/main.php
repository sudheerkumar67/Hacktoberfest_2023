<?php
require_once 'vendor/autoload.php'; // Include Stripe PHP library

\Stripe\Stripe::setApiKey('YOUR_STRIPE_SECRET_KEY');

if ($_SERVER['REQUEST_METHOD'] === 'POST') {
    $amount = $_POST['amount'] * 100; // Convert to cents
    $name = $_POST['name'];
    $email = $_POST['email'];

    // Create a payment intent
    $intent = \Stripe\PaymentIntent::create([
        'amount' => $amount,
        'currency' => 'usd',
    ]);

    // Render a confirmation message
    echo '<html>';
    echo '<head><title>Donation Confirmation</title></head>';
    echo '<body>';
    echo '<h1>Online Donation</h1>';
    echo '<h2>Thank you for your donation, ' . $name . '!</h2>';
    echo '<p>Amount: $' . number_format($amount / 100, 2) . '</p>';
    echo '<p>Email: ' . $email . '</p>';
    echo '<p>Transaction ID: ' . $intent->id . '</p>';
    echo '</body>';
    echo '</html>';
} else {
    echo '<html>';
    echo '<head><title>Online Donation</title></head>';
    echo '<body>';
    echo '<h1>Online Donation</h1>';
    echo '<form action="" method="POST">';
    echo '<label for="amount">Donation Amount (USD):</label>';
    echo '<input type="text" id="amount" name="amount" required><br><br>';
    echo '<label for="name">Name:</label>';
    echo '<input type="text" id="name" name="name" required><br><br>';
    echo '<label for="email">Email:</label>';
    echo '<input type="email" id="email" name="email" required><br><br>';
    echo '<button type="submit">Donate</button>';
    echo '</form>';
    echo '</body>';
    echo '</html>';
}
?>