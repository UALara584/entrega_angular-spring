import json

with open("ranking_raw.json", "r", encoding="utf-8") as f:
    data = json.load(f)

resultado = []
for item in data["top10"]:
    resultado.append({
        "id": item["rank"],
        "nombre": item["player"],
        "pais": item["country"],
        "ranking": item["rank"],
        "puntos": item["points"],
        "movimiento": item["move"]
    })

with open("tenistas.json", "w", encoding="utf-8") as f:
    json.dump(resultado, f, ensure_ascii=False, indent=2)

print("Archivo tenistas.json generado correctamente")