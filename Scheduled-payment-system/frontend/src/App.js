
import React, { useState } from 'react';
import PaymentForm from './Components/PaymentForm/PaymentForm';
import PaymentList from './Components/PaymentList/PaymentList';
// import React from 'react';
// import { root } from '.';
// import { getAllPayments, createPayment } from './services/paymentService
const  App = () => {
  const[refresh, setRefresh] = useState(false);

  const handlePaymentAdded = () =>{
    setRefresh(!refresh);
  };

  return(
    <div className='App'>
      <h1> Payment Added</h1>
      <PaymentForm onAddPayment={handlePaymentAdded}/>
      <PaymentList key={refresh} />

    </div>

    

  );
  
};

export default App;

