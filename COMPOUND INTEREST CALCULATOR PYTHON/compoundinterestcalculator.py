


PERCENTAGE = 100

principal_check = True
while principal_check:

    try:
        principal = float(input("Enter the principal:\n"))

        if principal < 0:
            print("Enter a non negative number!\n")

        else:
            break



    except ValueError:
        print("Invalid input. Enter only numbers")




amount_check = True
while amount_check:
    try:
        amount = float(input("\nEnter amount: positive for deposit or negative for withdrawal\n"))

        if amount < 0:
            print("Enter a non negative number")

        
        else:
            break
    
    except ValueError:
        print("Invalid input. Enter only numbers")





year_length_check = True
while year_length_check:
    try:
        year = float(input("Enter length of year: "))


        if year < 0:
            print("Year cannot be negtive")

        else:
            break


    except ValueError:
        print("Invalid input. Enter only numbers")





interest_check = True
while interest_check:
    try:
        interest = float(input("Enter interest rate"))

        if interest < 0:
            print("interest cannot be negative")


        else:
            break


    except ValueError:
        
        print("Invalid input. Enter only numbers")





variance_range_check = True
while variance_range_check:
    try:
        variance_range_interest = int(input("Enter interest variance range"))


        if variance_range_interest < 0:
    
            print("Enter a non-negative number")


        else:
            break


    except ValueError:
    
            print("Invalid input. Enter only numbers")





compound_frequency_check = True
while compound_frequency_check:
    try:
        compound_frequency = int(input("Enter the times the interest would be compounded: "))

        if compound_frequency < 0:
            print("Enter a non-negative number")


        else:
            break


    except ValueError:
        
        print("Invalid input. Enter only numbers")
        


    lower_bound_interest = interest - variance_range_interest

    upper_bound_interest = interest + variance_range_interest





        
def get_compoundinterestcalculator(interest, compound_frequency):
    estimated_interest = (interest/PERCENTAGE)/(compound_frequency) 
    

    return estimated_interest


print(get_compoundinterestcalculator(interest, compound_frequency))




   


















