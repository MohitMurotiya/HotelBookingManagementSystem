import { Room } from './room';

export class Hotel {
    hotelId: number;
    hotelName: string;
    rating: number;
    city: string;
    pincode: number;
    contact: string;
    email: string;
    description: string;
    room: Room = new Room();
}