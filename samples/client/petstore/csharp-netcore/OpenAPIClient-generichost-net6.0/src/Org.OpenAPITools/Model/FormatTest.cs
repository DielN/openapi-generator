// <auto-generated>
/*
 * OpenAPI Petstore
 *
 * This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
 *
 * The version of the OpenAPI document: 1.0.0
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */

using System;
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.IO;
using System.Text;
using System.Text.RegularExpressions;
using System.Text.Json;
using System.Text.Json.Serialization;
using System.ComponentModel.DataAnnotations;
using OpenAPIClientUtils = Org.OpenAPITools.Client.ClientUtils;

namespace Org.OpenAPITools.Model
{
    /// <summary>
    /// FormatTest
    /// </summary>
    public partial class FormatTest : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="FormatTest" /> class.
        /// </summary>
        /// <param name="binary">binary</param>
        /// <param name="byteProperty">byteProperty</param>
        /// <param name="date">date</param>
        /// <param name="dateTime">dateTime</param>
        /// <param name="decimalProperty">decimalProperty</param>
        /// <param name="doubleProperty">doubleProperty</param>
        /// <param name="floatProperty">floatProperty</param>
        /// <param name="int32">int32</param>
        /// <param name="int64">int64</param>
        /// <param name="integer">integer</param>
        /// <param name="number">number</param>
        /// <param name="password">password</param>
        /// <param name="patternWithDigits">A string that is a 10 digit number. Can have leading zeros.</param>
        /// <param name="patternWithDigitsAndDelimiter">A string starting with &#39;image_&#39; (case insensitive) and one to three digits following i.e. Image_01.</param>
        /// <param name="stringProperty">stringProperty</param>
        /// <param name="uuid">uuid</param>
        [JsonConstructor]
        public FormatTest(System.IO.Stream binary, byte[] byteProperty, DateTime date, DateTime dateTime, decimal decimalProperty, double doubleProperty, float floatProperty, int int32, long int64, int integer, decimal number, string password, string patternWithDigits, string patternWithDigitsAndDelimiter, string stringProperty, Guid uuid)
        {
#pragma warning disable CS0472 // The result of the expression is always the same since a value of this type is never equal to 'null'
#pragma warning disable CS8073 // The result of the expression is always the same since a value of this type is never equal to 'null'

            if (integer == null)
                throw new ArgumentNullException("integer is a required property for FormatTest and cannot be null.");

            if (int32 == null)
                throw new ArgumentNullException("int32 is a required property for FormatTest and cannot be null.");

            if (int64 == null)
                throw new ArgumentNullException("int64 is a required property for FormatTest and cannot be null.");

            if (number == null)
                throw new ArgumentNullException("number is a required property for FormatTest and cannot be null.");

            if (floatProperty == null)
                throw new ArgumentNullException("floatProperty is a required property for FormatTest and cannot be null.");

            if (doubleProperty == null)
                throw new ArgumentNullException("doubleProperty is a required property for FormatTest and cannot be null.");

            if (decimalProperty == null)
                throw new ArgumentNullException("decimalProperty is a required property for FormatTest and cannot be null.");

            if (stringProperty == null)
                throw new ArgumentNullException("stringProperty is a required property for FormatTest and cannot be null.");

            if (byteProperty == null)
                throw new ArgumentNullException("byteProperty is a required property for FormatTest and cannot be null.");

            if (binary == null)
                throw new ArgumentNullException("binary is a required property for FormatTest and cannot be null.");

            if (date == null)
                throw new ArgumentNullException("date is a required property for FormatTest and cannot be null.");

            if (dateTime == null)
                throw new ArgumentNullException("dateTime is a required property for FormatTest and cannot be null.");

            if (uuid == null)
                throw new ArgumentNullException("uuid is a required property for FormatTest and cannot be null.");

            if (password == null)
                throw new ArgumentNullException("password is a required property for FormatTest and cannot be null.");

            if (patternWithDigits == null)
                throw new ArgumentNullException("patternWithDigits is a required property for FormatTest and cannot be null.");

            if (patternWithDigitsAndDelimiter == null)
                throw new ArgumentNullException("patternWithDigitsAndDelimiter is a required property for FormatTest and cannot be null.");

#pragma warning restore CS0472 // The result of the expression is always the same since a value of this type is never equal to 'null'
#pragma warning restore CS8073 // The result of the expression is always the same since a value of this type is never equal to 'null'

            Binary = binary;
            ByteProperty = byteProperty;
            Date = date;
            DateTime = dateTime;
            DecimalProperty = decimalProperty;
            DoubleProperty = doubleProperty;
            FloatProperty = floatProperty;
            Int32 = int32;
            Int64 = int64;
            Integer = integer;
            Number = number;
            Password = password;
            PatternWithDigits = patternWithDigits;
            PatternWithDigitsAndDelimiter = patternWithDigitsAndDelimiter;
            StringProperty = stringProperty;
            Uuid = uuid;
        }

        /// <summary>
        /// Gets or Sets Binary
        /// </summary>
        [JsonPropertyName("binary")]
        public System.IO.Stream Binary { get; set; }

        /// <summary>
        /// Gets or Sets ByteProperty
        /// </summary>
        [JsonPropertyName("byte")]
        public byte[] ByteProperty { get; set; }

        /// <summary>
        /// Gets or Sets Date
        /// </summary>
        [JsonPropertyName("date")]
        public DateTime Date { get; set; }

        /// <summary>
        /// Gets or Sets DateTime
        /// </summary>
        [JsonPropertyName("dateTime")]
        public DateTime DateTime { get; set; }

        /// <summary>
        /// Gets or Sets DecimalProperty
        /// </summary>
        [JsonPropertyName("decimal")]
        public decimal DecimalProperty { get; set; }

        /// <summary>
        /// Gets or Sets DoubleProperty
        /// </summary>
        [JsonPropertyName("double")]
        public double DoubleProperty { get; set; }

        /// <summary>
        /// Gets or Sets FloatProperty
        /// </summary>
        [JsonPropertyName("float")]
        public float FloatProperty { get; set; }

        /// <summary>
        /// Gets or Sets Int32
        /// </summary>
        [JsonPropertyName("int32")]
        public int Int32 { get; set; }

        /// <summary>
        /// Gets or Sets Int64
        /// </summary>
        [JsonPropertyName("int64")]
        public long Int64 { get; set; }

        /// <summary>
        /// Gets or Sets Integer
        /// </summary>
        [JsonPropertyName("integer")]
        public int Integer { get; set; }

        /// <summary>
        /// Gets or Sets Number
        /// </summary>
        [JsonPropertyName("number")]
        public decimal Number { get; set; }

        /// <summary>
        /// Gets or Sets Password
        /// </summary>
        [JsonPropertyName("password")]
        public string Password { get; set; }

        /// <summary>
        /// A string that is a 10 digit number. Can have leading zeros.
        /// </summary>
        /// <value>A string that is a 10 digit number. Can have leading zeros.</value>
        [JsonPropertyName("pattern_with_digits")]
        public string PatternWithDigits { get; set; }

        /// <summary>
        /// A string starting with &#39;image_&#39; (case insensitive) and one to three digits following i.e. Image_01.
        /// </summary>
        /// <value>A string starting with &#39;image_&#39; (case insensitive) and one to three digits following i.e. Image_01.</value>
        [JsonPropertyName("pattern_with_digits_and_delimiter")]
        public string PatternWithDigitsAndDelimiter { get; set; }

        /// <summary>
        /// Gets or Sets StringProperty
        /// </summary>
        [JsonPropertyName("string")]
        public string StringProperty { get; set; }

        /// <summary>
        /// Gets or Sets Uuid
        /// </summary>
        [JsonPropertyName("uuid")]
        public Guid Uuid { get; set; }

        /// <summary>
        /// Gets or Sets additional properties
        /// </summary>
        [JsonExtensionData]
        public Dictionary<string, JsonElement> AdditionalProperties { get; } = new Dictionary<string, JsonElement>();

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class FormatTest {\n");
            sb.Append("  Binary: ").Append(Binary).Append("\n");
            sb.Append("  ByteProperty: ").Append(ByteProperty).Append("\n");
            sb.Append("  Date: ").Append(Date).Append("\n");
            sb.Append("  DateTime: ").Append(DateTime).Append("\n");
            sb.Append("  DecimalProperty: ").Append(DecimalProperty).Append("\n");
            sb.Append("  DoubleProperty: ").Append(DoubleProperty).Append("\n");
            sb.Append("  FloatProperty: ").Append(FloatProperty).Append("\n");
            sb.Append("  Int32: ").Append(Int32).Append("\n");
            sb.Append("  Int64: ").Append(Int64).Append("\n");
            sb.Append("  Integer: ").Append(Integer).Append("\n");
            sb.Append("  Number: ").Append(Number).Append("\n");
            sb.Append("  Password: ").Append(Password).Append("\n");
            sb.Append("  PatternWithDigits: ").Append(PatternWithDigits).Append("\n");
            sb.Append("  PatternWithDigitsAndDelimiter: ").Append(PatternWithDigitsAndDelimiter).Append("\n");
            sb.Append("  StringProperty: ").Append(StringProperty).Append("\n");
            sb.Append("  Uuid: ").Append(Uuid).Append("\n");
            sb.Append("  AdditionalProperties: ").Append(AdditionalProperties).Append("\n");
            sb.Append("}\n");
            return sb.ToString();
        }
        /// <summary>
        /// To validate all properties of the instance
        /// </summary>
        /// <param name="validationContext">Validation context</param>
        /// <returns>Validation Result</returns>
        public IEnumerable<System.ComponentModel.DataAnnotations.ValidationResult> Validate(ValidationContext validationContext)
        {
            // DoubleProperty (double) maximum
            if (this.DoubleProperty > (double)123.4)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for DoubleProperty, must be a value less than or equal to 123.4.", new [] { "DoubleProperty" });
            }

            // DoubleProperty (double) minimum
            if (this.DoubleProperty < (double)67.8)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for DoubleProperty, must be a value greater than or equal to 67.8.", new [] { "DoubleProperty" });
            }

            // FloatProperty (float) maximum
            if (this.FloatProperty > (float)987.6)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for FloatProperty, must be a value less than or equal to 987.6.", new [] { "FloatProperty" });
            }

            // FloatProperty (float) minimum
            if (this.FloatProperty < (float)54.3)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for FloatProperty, must be a value greater than or equal to 54.3.", new [] { "FloatProperty" });
            }

            // Int32 (int) maximum
            if (this.Int32 > (int)200)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for Int32, must be a value less than or equal to 200.", new [] { "Int32" });
            }

            // Int32 (int) minimum
            if (this.Int32 < (int)20)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for Int32, must be a value greater than or equal to 20.", new [] { "Int32" });
            }

            // Integer (int) maximum
            if (this.Integer > (int)100)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for Integer, must be a value less than or equal to 100.", new [] { "Integer" });
            }

            // Integer (int) minimum
            if (this.Integer < (int)10)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for Integer, must be a value greater than or equal to 10.", new [] { "Integer" });
            }

            // Number (decimal) maximum
            if (this.Number > (decimal)543.2)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for Number, must be a value less than or equal to 543.2.", new [] { "Number" });
            }

            // Number (decimal) minimum
            if (this.Number < (decimal)32.1)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for Number, must be a value greater than or equal to 32.1.", new [] { "Number" });
            }

            // Password (string) maxLength
            if (this.Password != null && this.Password.Length > 64)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for Password, length must be less than 64.", new [] { "Password" });
            }

            // Password (string) minLength
            if (this.Password != null && this.Password.Length < 10)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for Password, length must be greater than 10.", new [] { "Password" });
            }

            // PatternWithDigits (string) pattern
            Regex regexPatternWithDigits = new Regex(@"^\\d{10}$", RegexOptions.CultureInvariant);
            if (false == regexPatternWithDigits.Match(this.PatternWithDigits).Success)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for PatternWithDigits, must match a pattern of " + regexPatternWithDigits, new [] { "PatternWithDigits" });
            }

            // PatternWithDigitsAndDelimiter (string) pattern
            Regex regexPatternWithDigitsAndDelimiter = new Regex(@"^image_\\d{1,3}$", RegexOptions.CultureInvariant | RegexOptions.IgnoreCase);
            if (false == regexPatternWithDigitsAndDelimiter.Match(this.PatternWithDigitsAndDelimiter).Success)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for PatternWithDigitsAndDelimiter, must match a pattern of " + regexPatternWithDigitsAndDelimiter, new [] { "PatternWithDigitsAndDelimiter" });
            }

            // StringProperty (string) pattern
            Regex regexStringProperty = new Regex(@"[a-z]", RegexOptions.CultureInvariant | RegexOptions.IgnoreCase);
            if (false == regexStringProperty.Match(this.StringProperty).Success)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for StringProperty, must match a pattern of " + regexStringProperty, new [] { "StringProperty" });
            }

            yield break;
        }
    }

    /// <summary>
    /// A Json converter for type FormatTest
    /// </summary>
    public class FormatTestJsonConverter : JsonConverter<FormatTest>
    {
        /// <summary>
        /// The format to use to serialize Date
        /// </summary>
        public static string DateFormat { get; set; } = "yyyy'-'MM'-'dd";

        /// <summary>
        /// The format to use to serialize DateTime
        /// </summary>
        public static string DateTimeFormat { get; set; } = "yyyy'-'MM'-'dd'T'HH':'mm':'ss'.'fffffffK";

        /// <summary>
        /// A Json reader.
        /// </summary>
        /// <param name="utf8JsonReader"></param>
        /// <param name="typeToConvert"></param>
        /// <param name="jsonSerializerOptions"></param>
        /// <returns></returns>
        /// <exception cref="JsonException"></exception>
        public override FormatTest Read(ref Utf8JsonReader utf8JsonReader, Type typeToConvert, JsonSerializerOptions jsonSerializerOptions)
        {
            int currentDepth = utf8JsonReader.CurrentDepth;

            if (utf8JsonReader.TokenType != JsonTokenType.StartObject && utf8JsonReader.TokenType != JsonTokenType.StartArray)
                throw new JsonException();

            JsonTokenType startingTokenType = utf8JsonReader.TokenType;

            System.IO.Stream binary = default;
            byte[] byteProperty = default;
            DateTime date = default;
            DateTime dateTime = default;
            decimal decimalProperty = default;
            double doubleProperty = default;
            float floatProperty = default;
            int int32 = default;
            long int64 = default;
            int integer = default;
            decimal number = default;
            string password = default;
            string patternWithDigits = default;
            string patternWithDigitsAndDelimiter = default;
            string stringProperty = default;
            Guid uuid = default;

            while (utf8JsonReader.Read())
            {
                if (startingTokenType == JsonTokenType.StartObject && utf8JsonReader.TokenType == JsonTokenType.EndObject && currentDepth == utf8JsonReader.CurrentDepth)
                    break;

                if (startingTokenType == JsonTokenType.StartArray && utf8JsonReader.TokenType == JsonTokenType.EndArray && currentDepth == utf8JsonReader.CurrentDepth)
                    break;

                if (utf8JsonReader.TokenType == JsonTokenType.PropertyName && currentDepth == utf8JsonReader.CurrentDepth - 1)
                {
                    string propertyName = utf8JsonReader.GetString();
                    utf8JsonReader.Read();

                    switch (propertyName)
                    {
                        case "binary":
                            binary = JsonSerializer.Deserialize<System.IO.Stream>(ref utf8JsonReader, jsonSerializerOptions);
                            break;
                        case "byte":
                            byteProperty = JsonSerializer.Deserialize<byte[]>(ref utf8JsonReader, jsonSerializerOptions);
                            break;
                        case "date":
                            date = JsonSerializer.Deserialize<DateTime>(ref utf8JsonReader, jsonSerializerOptions);
                            break;
                        case "dateTime":
                            dateTime = JsonSerializer.Deserialize<DateTime>(ref utf8JsonReader, jsonSerializerOptions);
                            break;
                        case "decimal":
                            decimalProperty = JsonSerializer.Deserialize<decimal>(ref utf8JsonReader, jsonSerializerOptions);
                            break;
                        case "double":
                            doubleProperty = utf8JsonReader.GetDouble();
                            break;
                        case "float":
                            floatProperty = (float)utf8JsonReader.GetDouble();
                            break;
                        case "int32":
                            int32 = utf8JsonReader.GetInt32();
                            break;
                        case "int64":
                            int64 = utf8JsonReader.GetInt64();
                            break;
                        case "integer":
                            integer = utf8JsonReader.GetInt32();
                            break;
                        case "number":
                            number = utf8JsonReader.GetInt32();
                            break;
                        case "password":
                            password = utf8JsonReader.GetString();
                            break;
                        case "pattern_with_digits":
                            patternWithDigits = utf8JsonReader.GetString();
                            break;
                        case "pattern_with_digits_and_delimiter":
                            patternWithDigitsAndDelimiter = utf8JsonReader.GetString();
                            break;
                        case "string":
                            stringProperty = utf8JsonReader.GetString();
                            break;
                        case "uuid":
                            uuid = utf8JsonReader.GetGuid();
                            break;
                        default:
                            break;
                    }
                }
            }

            return new FormatTest(binary, byteProperty, date, dateTime, decimalProperty, doubleProperty, floatProperty, int32, int64, integer, number, password, patternWithDigits, patternWithDigitsAndDelimiter, stringProperty, uuid);
        }

        /// <summary>
        /// A Json writer
        /// </summary>
        /// <param name="writer"></param>
        /// <param name="formatTest"></param>
        /// <param name="jsonSerializerOptions"></param>
        /// <exception cref="NotImplementedException"></exception>
        public override void Write(Utf8JsonWriter writer, FormatTest formatTest, JsonSerializerOptions jsonSerializerOptions)
        {
            writer.WriteStartObject();

            writer.WritePropertyName("binary");
            JsonSerializer.Serialize(writer, formatTest.Binary, jsonSerializerOptions);
            writer.WritePropertyName("byte");
            JsonSerializer.Serialize(writer, formatTest.ByteProperty, jsonSerializerOptions);
            writer.WriteString("date", formatTest.Date.ToString(DateFormat));
            writer.WriteString("dateTime", formatTest.DateTime.ToString(DateTimeFormat));
            writer.WritePropertyName("decimal");
            JsonSerializer.Serialize(writer, formatTest.DecimalProperty, jsonSerializerOptions);
            writer.WriteNumber("double", formatTest.DoubleProperty);
            writer.WriteNumber("float", formatTest.FloatProperty);
            writer.WriteNumber("int32", formatTest.Int32);
            writer.WriteNumber("int64", formatTest.Int64);
            writer.WriteNumber("integer", formatTest.Integer);
            writer.WriteNumber("number", formatTest.Number);
            writer.WriteString("password", formatTest.Password);
            writer.WriteString("pattern_with_digits", formatTest.PatternWithDigits);
            writer.WriteString("pattern_with_digits_and_delimiter", formatTest.PatternWithDigitsAndDelimiter);
            writer.WriteString("string", formatTest.StringProperty);
            writer.WriteString("uuid", formatTest.Uuid);

            writer.WriteEndObject();
        }
    }
}
