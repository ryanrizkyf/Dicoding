while True:
    print('Masukkan nama Anda:')
    name = input()
    if name.isalpha():
        print("Halo", name)
        break
    print('Masukkan nama Anda dengan benar.')

print("Halo!\nKapan terakhir kali kita bertemu?\nKita bertemu hari Jum\'at yang lalu.")
