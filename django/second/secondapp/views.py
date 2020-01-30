from django.shortcuts import render
from .models import shop1

# Create your views here.
def main(request):
    shopList = shop1.objects.all()
    return render(request, 'secondapp/main.html', {'shopList':shopList})