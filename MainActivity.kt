package com.example.calculator


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import net.objecthunter.exp4j.Expression
import net.objecthunter.exp4j.ExpressionBuilder

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val one = findViewById<TextView>(R.id.one)
        val result = findViewById<TextView>(R.id.result)
        val two = findViewById<TextView>(R.id.two)
        val three = findViewById<TextView>(R.id.three)
        val four = findViewById<TextView>(R.id.four)
        val five = findViewById<TextView>(R.id.five)
        val six = findViewById<TextView>(R.id.six)
        val seven = findViewById<TextView>(R.id.seven)
        val eight = findViewById<TextView>(R.id.eight)
        val nine = findViewById<TextView>(R.id.nine)
        val dot = findViewById<TextView>(R.id.dot)
        val plus = findViewById<TextView>(R.id.plus)
        val minus = findViewById<TextView>(R.id.minus)
        val mul = findViewById<TextView>(R.id.mul)
        val divide = findViewById<TextView>(R.id.divide)
        val clear = findViewById<TextView>(R.id.clear)
        val backspace = findViewById<TextView>(R.id.backspace)
        val del = findViewById<TextView>(R.id.del)
        val exp = findViewById<TextView>(R.id.expression)
        val equal = findViewById<TextView>(R.id.equals)
        val zero = findViewById<TextView>(R.id.zero)

        one.setOnClickListener {

            exp.append("1")

        }
        two.setOnClickListener {

            exp.append("2")
        }
        three.setOnClickListener {

            exp.append("3")
        }
        four.setOnClickListener {

            exp.append("4")
        }
        five.setOnClickListener {

            exp.append("5")
        }
        six.setOnClickListener {

            exp.append("6")
        }
        seven.setOnClickListener {

            exp.append("7")
        }
        eight.setOnClickListener {

            exp.append("8")
        }
        nine.setOnClickListener {

            exp.append("9")
        }
        plus.setOnClickListener {

            exp.append("+")
        }
        minus.setOnClickListener {

            exp.append("-")
        }
        divide.setOnClickListener {

            exp.append("/")
        }
        mul.setOnClickListener {

            exp.append("*")
        }
        zero.setOnClickListener {
            exp.append("0")
        }
        dot.setOnClickListener {
            exp.append(".")
        }
        equal.setOnClickListener {
            if (exp.getText().toString() == "") {
                val toast =
                    Toast.makeText(applicationContext, "Enter Expression", Toast.LENGTH_SHORT)
                toast.show()
            } else if (exp.getText().toString() != "") {
                val a = exp.getText().toString()
                val b = ExpressionBuilder(a).build()
                val solve = b.evaluate()
                result.setText(solve.toString())
            } else {
                val toast1 = Toast.makeText(
                    applicationContext,
                    "Something Happens To Me",
                    Toast.LENGTH_SHORT
                )
                toast1.show()
            }
        }
        clear.setOnClickListener {
            result.setText("")
            exp.setText("")
        }
        del.setOnClickListener {
            result.setText("")
            exp.setText("")
        }
        backspace.setOnClickListener {
            val text = exp.text.toString()
                exp.text = text.drop(1)


        }
    }
}
