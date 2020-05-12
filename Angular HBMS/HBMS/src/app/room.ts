import { Hotel } from './hotel';

export class Room {
    id: number;
    roomNo: number;
    roomType: string;
    price: number;
    availability: boolean;
    hotel: Hotel
}