select person.lastname,person.firstname, Address.city,Address.state
from person
left join Address
on Person.personId=Address.personId;