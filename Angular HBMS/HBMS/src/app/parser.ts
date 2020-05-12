import { RegisterUser } from './register';
import { Hotel } from './hotel';
import { Room } from './room';

export class Parser {
    user: RegisterUser = new RegisterUser();
    hotel: Hotel = new Hotel();
    room: Room = new Room();
}