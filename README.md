<p>
<h1 align="center"> Keywords Mobile Backend </h1>
Base URL: https://keywords-mobile-backend.herokuapp.com/
</p>

| Method | Endpoint | Description
|--|--|--|
| `GET` | `/keyword/allwords` | Returns all words |
| `GET` | `/keyword/words` | Returns the word corresponding to the 'search' parameter |
| `GET` | `/keyword/deleteword` | Deletes the word corresponding to the 'delete' parameter |
| `POST` | `/keyword/enterword` | Used to add words |

### Example Usage
1-) Request URL: https://keywords-mobile-backend.herokuapp.com/keyword/allwords

Response
```json
{
  "wordCount": 2,
  "words": [
    {
      "id": 1,
      "ing": "apple",
      "tr": "elma",
      "level": "EASY"
    },
    {
      "id": 2,
      "ing": "lawyer",
      "tr": "avukat",
      "level": "EASY"
    }
  ]
}
```

2-) Request URL: http://keywords-mobile-backend.herokuapp.com/keyword/enterword
```json
{
  "ing": "dirty",
  "tr": "kirli",
  "level": 3
}
```
Response
```json
{
  "id": 3,
  "ing": "dirty",
  "tr": "kirli",
  "level": "HARD"
}
```
