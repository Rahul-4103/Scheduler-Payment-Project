import React, { useEffect, useState } from "react";
import { getAllPayments } from "../../services/paymentService";

const PaymentList = () => {
    const[payments, setPayments] = useState([]);

    const fetchPayments = async () => {
       
        try{
            const response = await getAllPayments();
            setPayments(response.data);
        }
        catch(error){
            console.error("Error fetching Payments: ", error);
        }
    };


useEffect(() => {
    fetchPayments();
}, []);

return(
    <div>
        <h3> All payments</h3>
        <ul>
            {payments.map((payment) => (
                <li key={payment.id}>
                    {payment.payerName} - rs{payment.amount} - {payment.scheduledTime} - {payment.completed ? 'Done' : 'Pending'}
                </li>
            ))}
        </ul>
    </div>
);
};
export default PaymentList;