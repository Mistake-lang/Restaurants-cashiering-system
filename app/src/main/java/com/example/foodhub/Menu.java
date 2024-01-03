package com.example.foodhub;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Menu extends AppCompatActivity {

    private int quantity1 = 0;
    private int quantity2 = 0;
    private int quantity3 = 0;
    private int quantity4 = 0;
    private int quantity5 = 0;
    private int quantity6 = 0;
    private int quantity7 = 0;
    private int quantity8 = 0;
    final private double price1 = 99.00;
    final private double price2 = 69.00;
    final private double price3 = 89.00;
    final private double price4 = 65.00;
    final private double price5 = 125.00;
    final private double price6 = 100.00;
    final private double price7 = 35.00;
    final private double price8 = 35.00;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        final TextView quantity1TextView = findViewById(R.id.quantityTextView);
        final TextView quantity2TextView = findViewById(R.id.quantity2TextView);
        final TextView quantity3TextView = findViewById(R.id.quantity3TextView);
        final TextView quantity4TextView = findViewById(R.id.quantity4TextView);
        final TextView quantity5TextView = findViewById(R.id.quantity5TextView);
        final TextView quantity6TextView = findViewById(R.id.quantity6TextView);
        final TextView quantity7TextView = findViewById(R.id.quantity7TextView);
        final TextView quantity8TextView = findViewById(R.id.quantity8TextView);

        Button decrementButton1 = findViewById(R.id.decrementButton);
        Button incrementButton1 = findViewById(R.id.incrementButton);
        Button decrementButton2 = findViewById(R.id.decrementButton2);
        Button incrementButton2 = findViewById(R.id.incrementButton2);
        Button decrementButton3 = findViewById(R.id.decrementButton3);
        Button incrementButton3 = findViewById(R.id.incrementButton3);
        Button decrementButton4 = findViewById(R.id.decrement4Button);
        Button incrementButton4 = findViewById(R.id.increment4Button);
        Button decrementButton5 = findViewById(R.id.decrement5Button);
        Button incrementButton5 = findViewById(R.id.increment5Button);
        Button decrementButton6 = findViewById(R.id.decrement6Button);
        Button incrementButton6 = findViewById(R.id.increment6Button);
        Button decrementButton7 = findViewById(R.id.decrement7Button);
        Button incrementButton7 = findViewById(R.id.increment7Button);
        Button decrementButton8 = findViewById(R.id.decrement8Button);
        Button incrementButton8 = findViewById(R.id.increment8Button);

        Button payButton = findViewById(R.id.payButton);

        final EditText cashEditText = findViewById(R.id.cashEditText);
        final LinearLayout receiptLayout = findViewById(R.id.receiptLayout);
        final TextView totalAmountReceiptTextView = findViewById(R.id.totalAmountReceiptTextView);
        final TextView changeReceiptTextView = findViewById(R.id.changeReceiptTextView);
        final TextView totalPaymentTextView = findViewById(R.id.totalPaymentTextView);

        decrementButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (quantity1 > 0) {
                    quantity1--;
                    quantity1TextView.setText(String.valueOf(quantity1));
                    updateTotalPayment();
                }
            }
        });

        incrementButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                quantity1++;
                quantity1TextView.setText(String.valueOf(quantity1));
                updateTotalPayment();
            }
        });

        decrementButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (quantity2 > 0) {
                    quantity2--;
                    quantity2TextView.setText(String.valueOf(quantity2));
                    updateTotalPayment();
                }
            }
        });

        incrementButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                quantity2++;
                quantity2TextView.setText(String.valueOf(quantity2));
                updateTotalPayment();
            }
        });

        decrementButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (quantity3 > 0) {
                    quantity3--;
                    quantity3TextView.setText(String.valueOf(quantity3));
                    updateTotalPayment();
                }
            }
        });

        incrementButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                quantity3++;
                quantity3TextView.setText(String.valueOf(quantity3));
                updateTotalPayment();
            }
        });

        decrementButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (quantity4 > 0) {
                    quantity4--;
                    quantity4TextView.setText(String.valueOf(quantity4));
                    updateTotalPayment();
                }
            }
        });

        incrementButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                quantity4++;
                quantity4TextView.setText(String.valueOf(quantity4));
                updateTotalPayment();
            }
        });


        decrementButton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (quantity5 > 0) {
                    quantity5--;
                    quantity5TextView.setText(String.valueOf(quantity5));
                    updateTotalPayment();
                }
            }
        });

        incrementButton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                quantity5++;
                quantity5TextView.setText(String.valueOf(quantity5));
                updateTotalPayment();
            }
        });


        decrementButton6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (quantity6 > 0) {
                    quantity6--;
                    quantity6TextView.setText(String.valueOf(quantity6));
                    updateTotalPayment();
                }
            }
        });

        incrementButton6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                quantity6++;
                quantity6TextView.setText(String.valueOf(quantity6));
                updateTotalPayment();
            }
        });

        decrementButton7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (quantity7 > 0) {
                    quantity7--;
                    quantity7TextView.setText(String.valueOf(quantity7));
                    updateTotalPayment();
                }
            }
        });

        incrementButton7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                quantity7++;
                quantity7TextView.setText(String.valueOf(quantity7));
                updateTotalPayment();
            }
        });

        decrementButton8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (quantity8 > 0) {
                    quantity8--;
                    quantity8TextView.setText(String.valueOf(quantity8));
                    updateTotalPayment();
                }
            }
        });

        incrementButton8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                quantity8++;
                quantity8TextView.setText(String.valueOf(quantity8));
                updateTotalPayment();
            }
        });

        payButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double subtotal1 = quantity1 * price1;
                double subtotal2 = quantity2 * price2;
                double subtotal3 = quantity3 * price3;
                double subtotal4 = quantity4 * price4;
                double subtotal5 = quantity5 * price5;
                double subtotal6 = quantity6 * price6;
                double subtotal7 = quantity7 * price7;
                double subtotal8 = quantity8 * price8;

                double totalAmount = subtotal1 + subtotal2 + subtotal3 + subtotal4 + subtotal5 + subtotal6 + subtotal7 + subtotal8;

                String cashInput = cashEditText.getText().toString();
                if (!cashInput.isEmpty()) {
                    double paymentAmount = Double.parseDouble(cashInput);
                    double change = paymentAmount - totalAmount;

                    if (change >= 0) {
                        totalAmountReceiptTextView.setText("Total: Php " + String.format("%.2f", totalAmount));
                        changeReceiptTextView.setText("Change: Php " + String.format("%.2f", change));
                        receiptLayout.setVisibility(View.VISIBLE);
                    } else {
                        changeReceiptTextView.setText("Insufficient cash!");
                        receiptLayout.setVisibility(View.GONE);
                    }
                } else {
                    changeReceiptTextView.setText("Enter cash amount!");
                    receiptLayout.setVisibility(View.GONE);
                }
            }
        });
    }

    private void updateTotalPayment() {

        double subtotal1 = quantity1 * price1;
        double subtotal2 = quantity2 * price2;
        double subtotal3 = quantity3 * price3;
        double subtotal4 = quantity4 * price4;
        double subtotal5 = quantity5 * price5;
        double subtotal6 = quantity6 * price6;
        double subtotal7 = quantity7 * price7;
        double subtotal8 = quantity8 * price8;

        double totalPayment = subtotal1 + subtotal2 + subtotal3 + subtotal4 + subtotal5 + subtotal6 + subtotal7 + subtotal8 ;
        TextView totalPaymentTextView = findViewById(R.id.totalPaymentTextView);
        totalPaymentTextView.setText("Total Payment: Php " + String.format("%.2f", totalPayment));
    }


}
