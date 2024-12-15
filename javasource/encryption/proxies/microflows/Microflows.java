// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package encryption.proxies.microflows;

import java.util.HashMap;
import java.util.Map;
import com.mendix.core.Core;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.systemwideinterfaces.core.IMendixObject;

public class Microflows
{
	/**
	 * @deprecated
	 * The default constructor of the Microflows class should not be used.
	 * Use the static microflow invocation methods instead.
	 */
	@java.lang.Deprecated(since = "9.12", forRemoval = true)
	public Microflows() {}

	// These are the microflows for the Encryption module
	public static java.lang.String decrypt(IContext context, java.lang.String _encrypted)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Encrypted", _encrypted);
		return (java.lang.String) Core.microflowCall("Encryption.Decrypt").withParams(params).execute(context);
	}
	public static void decrypt_Document(IContext context, system.proxies.FileDocument _fileDocument_Output, system.proxies.FileDocument _fileDocument_ToDecrypt, encryption.proxies.PGPCertificate _privateKeyForDecryption)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("FileDocument_Output", _fileDocument_Output == null ? null : _fileDocument_Output.getMendixObject());
		params.put("FileDocument_ToDecrypt", _fileDocument_ToDecrypt == null ? null : _fileDocument_ToDecrypt.getMendixObject());
		params.put("PrivateKeyForDecryption", _privateKeyForDecryption == null ? null : _privateKeyForDecryption.getMendixObject());
		Core.microflowCall("Encryption.Decrypt_Document").withParams(params).execute(context);
	}
	public static java.lang.String decryptCommunityCommonsString(IContext context, java.lang.String _value, java.lang.String _key)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Value", _value);
		params.put("Key", _key);
		return (java.lang.String) Core.microflowCall("Encryption.DecryptCommunityCommonsString").withParams(params).execute(context);
	}
	public static encryption.proxies.PGPCertificate dS_GetAssociatedPubKey(IContext context, encryption.proxies.PGPCertificate _certificate)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Certificate", _certificate == null ? null : _certificate.getMendixObject());
		IMendixObject result = (IMendixObject)Core.microflowCall("Encryption.DS_GetAssociatedPubKey").withParams(params).execute(context);
		return result == null ? null : encryption.proxies.PGPCertificate.initialize(context, result);
	}
	public static java.lang.String encrypt(IContext context, java.lang.String _plain)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Plain", _plain);
		return (java.lang.String) Core.microflowCall("Encryption.Encrypt").withParams(params).execute(context);
	}
	public static void encrypt_Document(IContext context, system.proxies.FileDocument _fileDocument_ToEncrypt, system.proxies.FileDocument _fileDocument_Output, encryption.proxies.PGPCertificate _externalPubKey)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("FileDocument_ToEncrypt", _fileDocument_ToEncrypt == null ? null : _fileDocument_ToEncrypt.getMendixObject());
		params.put("FileDocument_Output", _fileDocument_Output == null ? null : _fileDocument_Output.getMendixObject());
		params.put("ExternalPubKey", _externalPubKey == null ? null : _externalPubKey.getMendixObject());
		Core.microflowCall("Encryption.Encrypt_Document").withParams(params).execute(context);
	}
	public static java.lang.String forceEncrypt(IContext context, java.lang.String _plain)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Plain", _plain);
		return (java.lang.String) Core.microflowCall("Encryption.ForceEncrypt").withParams(params).execute(context);
	}
	public static void mB_ChangePasswordSave(IContext context, encryption.proxies.PasswordData _passwordData)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("PasswordData", _passwordData == null ? null : _passwordData.getMendixObject());
		Core.microflowCall("Encryption.MB_ChangePasswordSave").withParams(params).execute(context);
	}
	public static void mB_GenerateCertificate(IContext context, encryption.proxies.PGPCertificate _certificate_PrivateKey)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Certificate_PrivateKey", _certificate_PrivateKey == null ? null : _certificate_PrivateKey.getMendixObject());
		Core.microflowCall("Encryption.MB_GenerateCertificate").withParams(params).execute(context);
	}
	public static void mB_GenerateKeyShowPage(IContext context)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		Core.microflowCall("Encryption.MB_GenerateKeyShowPage").withParams(params).execute(context);
	}
	public static void mB_NewPrivateKey(IContext context)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		Core.microflowCall("Encryption.MB_NewPrivateKey").withParams(params).execute(context);
	}
	public static void mB_NewPubKey(IContext context)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		Core.microflowCall("Encryption.MB_NewPubKey").withParams(params).execute(context);
	}
	public static void mB_OpenCertificateDetails(IContext context, encryption.proxies.PGPCertificate _certificate)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Certificate", _certificate == null ? null : _certificate.getMendixObject());
		Core.microflowCall("Encryption.MB_OpenCertificateDetails").withParams(params).execute(context);
	}
	public static void mB_SaveCertificate(IContext context, encryption.proxies.PGPCertificate _certificate)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Certificate", _certificate == null ? null : _certificate.getMendixObject());
		Core.microflowCall("Encryption.MB_SaveCertificate").withParams(params).execute(context);
	}
	public static void mB_SavePassword(IContext context, encryption.proxies.ExampleConfiguration _exampleConfiguration)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("ExampleConfiguration", _exampleConfiguration == null ? null : _exampleConfiguration.getMendixObject());
		Core.microflowCall("Encryption.MB_SavePassword").withParams(params).execute(context);
	}
	public static void mB_ShowChangePassword(IContext context, encryption.proxies.ExampleConfiguration _exampleConfiguration)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("ExampleConfiguration", _exampleConfiguration == null ? null : _exampleConfiguration.getMendixObject());
		Core.microflowCall("Encryption.MB_ShowChangePassword").withParams(params).execute(context);
	}
}
