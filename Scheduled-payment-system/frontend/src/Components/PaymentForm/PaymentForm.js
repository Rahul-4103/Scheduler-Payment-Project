import React, {useState} from "react";
import { createPayment } from "../../services/paymentService";

const PaymentForm = ({onAddPayment}) => {
    const[payerName, setPayerName] = useState('');
    const[amount, setAmount] = useState('');
    const[scheduledTime, setScheduledTime] = useState('');

    

    const handleSubmit = async (e) =>{
        e.preventDefault();
        const newPayment = {payerName, amount, scheduledTime };
    
    try{
        await createPayment(newPayment);
        onAddPayment();//
        setPayerName('');
        setAmount('');
        setScheduledTime('');

    }
    catch(error){
        console.error("Payment creation failed.", error);
    }
    
};

    return(
        <form onSubmit={handleSubmit}>
            <h2>Scheduled Payment</h2>
            <input type="text" placeholder="payerName" value={payerName} onChange={(e) => setPayerName(e.target.value)} required/>

            <input type="number" placeholder="Amount" value={amount} onChange={(e) => setAmount(e.target.value)} required/>

            <input type="datetime-local" value={scheduledTime} onChange={(e) => setScheduledTime(e.target.value)} required/>
            <button type="Submit">Add Payment</button>
        </form>
    );
};


export default PaymentForm;