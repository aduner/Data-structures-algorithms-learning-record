for year in range(1900,2000):
    for day in  range(1,32):
        if day<10:
            day=f'0{day}'
        date=int(f'{year}06{day}')
        if (date%6036)==0:
            print(date)
            break