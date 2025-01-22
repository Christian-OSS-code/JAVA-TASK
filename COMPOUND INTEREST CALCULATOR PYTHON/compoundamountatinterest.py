


#COMPOUND INTEREST CALCULATOR

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
        print("Invalid input. Enter only numbers\n")




amount_check = True
while amount_check:
    try:
        amount = float(input("\nEnter amount: positive for deposit or negative for withdrawal\n"))

        if amount < 0:
            print("Enter a non negative number\n")

        
        else:
            break
    
    except ValueError:
        print("Invalid input. Enter only numbers\n")





year_length_check = True
while year_length_check:
    try:
        year = float(input("Enter length of year:\n"))


        if year < 0:
            print("Year cannot be negtive\n")

        else:
            break


    except ValueError:
        print("Invalid input. Enter only numbers\n")





interest_check = True
while interest_check:
    try:
        interest = float(input("Enter interest rate\n"))

        if interest < 0:
            print("interest cannot be negative\n")


        else:
            break


    except ValueError:
        
        print("Invalid input. Enter only numbers\n")





variance_range_check = True
while variance_range_check:
    try:
        variance_range_interest = int(input("Enter interest variance range\n"))


        if variance_range_interest < 0:
    
            print("Enter a non-negative number\n")


        else:
            break


    except ValueError:
    
            print("Invalid input. Enter only numbers\n")





compound_frequency_check = True
while compound_frequency_check:
    try:
        compound_frequency = int(input("Enter the times the interest would be compounded:\n"))

        if compound_frequency < 0:
            print("Enter a non-negative number\n")


        else:
            break


    except ValueError:
        
        print("Invalid input. Enter only numbers\n")
        



lower_bound_interest = interest - variance_range_interest

upper_bound_interest = interest + variance_range_interest





        
def get_compoundinterestcalculator(interest, compound_frequency):
    estimated_interest = (interest/PERCENTAGE)/(compound_frequency) 
    

    return estimated_interest





def get_totalperiodcalculator(year, compound_frequency):
    total_period = year * compound_frequency

    return total_period






def get_interestatlowerbound(lower_bound_interest, compound_frequency):
    estimated_lower_interest = (lower_bound_interest/PERCENTAGE)/(compound_frequency)

    return estimated_lower_interest






def get_interestatupperbound(upper_bound_interest, compound_frequency):
    estimated_upper_interest = (upper_bound_interest/PERCENTAGE)/(compound_frequency)

    return estimated_upper_interest






def get_lowerboundcompoundamount(principal, amount, lower_bound_interest, compound_frequency, year):

    rate = get_interestatlowerbound(lower_bound_interest, compound_frequency)


    calculated_period = get_totalperiodcalculator(year, compound_frequency)


    future_amount = principal * ((1 + rate) **(calculated_period))


    for count in range(int(calculated_period)):


        future_amount += amount * ((1 + rate) **(calculated_period - count))

    return future_amount 








def get_compoundamountatinterest(principal, amount, interest, compound_frequency, year):
    
    rate = get_compoundinterestcalculator(interest, compound_frequency)


    calculated_period = get_totalperiodcalculator(year, compound_frequency)


    future_amount_at_interest = principal * ((1 + rate) ** (calculated_period))


    for count in range(int(calculated_period)):
    
        future_amount_at_interest += amount * ((1 + rate) ** (calculated_period - count))

    return future_amount_at_interest







def get_upperboundcompoundamount(principal, amount, upper_bound_interest, compound_frequency, year):

    rate = get_interestatupperbound(upper_bound_interest, compound_frequency)

    calculated_period = get_totalperiodcalculator(year, compound_frequency)

    future_amount_upper_bound = principal * ((1 + rate) **(calculated_period))


    for count in range(int(calculated_period)):
    
        future_amount_upper_bound += amount * ((1 + rate) **(calculated_period - count))

    return future_amount_upper_bound





def printFutureInvestmentGrowth():


    lower_interest_rate = get_interestatlowerbound(lower_bound_interest, compound_frequency)


    central_interest_rate = get_compoundinterestcalculator(interest, compound_frequency)


    upper_interest_rate = get_interestatupperbound(upper_bound_interest, compound_frequency)



    total_period = get_totalperiodcalculator(year, compound_frequency)


    future_amount_at_lower_bound = get_lowerboundcompoundamount(principal, amount, lower_bound_interest, compound_frequency, year)


    future_amount_at_interest = get_compoundamountatinterest(principal, amount, interest, compound_frequency, year)



    future_amount_at_upper_interest = get_upperboundcompoundamount(principal, amount, upper_bound_interest, compound_frequency, year)


    




    print("\n\nVIEW YOUR INVESTMENT GROWTH!")

    print("="*80)

    print(f"The lower bound interest rate is {lower_interest_rate:.4f}")


    print(f"The interest rate is {central_interest_rate:.4f}")

    print(f"The upper bound interest rate is {upper_interest_rate:.4f}")

    print(f"The total period is: {total_period:.2f}")

    print("="*80)

    print(f"Compounded amount for lower interest at: {lower_bound_interest:.2f}% is # {future_amount_at_lower_bound:.2f}")

    print(f"Compounded amount for central interest at: {interest:.2f}% is # {future_amount_at_interest:.2f}")

    print(f"Compounded amount for upper interest at: {upper_bound_interest :.2f}% is # {future_amount_at_upper_interest:.2f}")

    print("="*80)

    print("="*80)


printFutureInvestmentGrowth()
    

    

    

    




    

    

    

   


















