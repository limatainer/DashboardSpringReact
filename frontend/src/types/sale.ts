import { client } from "./client"

export type Sale = {
  id: number;
  visits: number;
  trainings: number;
  price: number;
  date: string;
  client: client;
}

export type SalePage = {
  content?: Sale[];
  last: boolean;
  totalPages: number;
  totalElements: number;
  number: number;
  numberOfElements?: number;
  first: boolean;
  size?: number;
  empty?: boolean;
}

export type SaleSum = {
  clientName: string;
  sum: number;
}

export type SaleSuccess = {
  clientName: string;
  visits: number;
  trainings: number;
}