from django.shortcuts import render
from .models import shop

# Create your views here.
def main(request):
    shopList = shop.objects.all()
    return render(request, 'secondapp/main.html', {'shopList':shopList})