import axios from 'axios';

const BASE_URL = "http://localhost:9090/api/payments";
export const getAllPayments = async () =>{
    return axios.get(BASE_URL);
};

export const createPayment = (paymentData) => {
    return axios.post(BASE_URL, paymentData);
};