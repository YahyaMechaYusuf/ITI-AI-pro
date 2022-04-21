from selenium import webdriver
import csv

new_prices=[]
new_ratings=[]


PATH = "C:\Program Files (x86)\chromedriver_win32\chromedriver.exe"
driver = webdriver.Chrome(PATH)

 

driver.get('https://www.amazon.in/gp/bestsellers/books/')

 

titles=driver.find_elements_by_xpath("//a/div[@class='p13n-sc-truncate-desktop-type2 p13n-sc-truncated']")
prices=driver.find_elements_by_xpath("//a/span/span[@class='p13n-sc-price']")
ratings=driver.find_elements_by_xpath("//span[1]/span[@class='zg-badge-text']")
for title in titles:
    print(title.text)
for price in prices:
    print(price.text)
for rating in ratings:
    print(rating.text)
for price in prices:
    x=str(price).replace("₹","")
    new_prices.append(x)
for rating in ratings:
    y=str(rating).replace("#","")
    new_ratings.append(y)

with open(r"H:BOOKS.csv","w",encoding='utf-8') as csvfile:
    csvwriter=csv.writer(csvfile,delimiter=',')
    csvwriter.writerow(['Book_name','Price','Rating'])
    for i in range(0,len(titles)):
        csvwriter.writerow([titles[i].text,prices[i].text,ratings[i].text ])