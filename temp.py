import os
dirs = os.listdir('.\\Python\\Easy')
for file_name in dirs:
    # if len(file_name.split()[0]) < 3:
    #     os.rename(f'.\\Python\\Easy\\{file_name}',
    #               f".\\Python\\Easy\\{'0'+file_name}")
    x = file_name.split()
    l=x[0]
    r=' '.join(x[1:])
    if '.' not in file_name:
        name = l+'. '+r
        os.rename(f'.\\Python\\Easy\\{file_name}',
                f".\\Python\\Easy\\{name}")