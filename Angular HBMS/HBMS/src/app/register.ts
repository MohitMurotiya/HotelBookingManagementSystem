import { User } from './user';
import { Address } from './address';

export class RegisterUser {
    id: number;
	fname: string;
	lname: string;
	email: string;
	number: string;
	addr: Address = new Address();
	user: User = new User();
}