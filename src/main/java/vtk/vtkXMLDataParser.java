// java wrapper for vtkXMLDataParser object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkXMLDataParser extends vtkXMLParser
{

  private native int IsTypeOf_0(byte[] id0, int len0);
  public int IsTypeOf(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return IsTypeOf_0(bytes0, bytes0.length);
  }

  private native int IsA_1(byte[] id0, int len0);
  public int IsA(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return IsA_1(bytes0, bytes0.length);
  }

  private native long GetNumberOfGenerationsFromBaseType_2(byte[] id0, int len0);
  public long GetNumberOfGenerationsFromBaseType(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return GetNumberOfGenerationsFromBaseType_2(bytes0, bytes0.length);
  }

  private native long GetNumberOfGenerationsFromBase_3(byte[] id0, int len0);
  public long GetNumberOfGenerationsFromBase(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return GetNumberOfGenerationsFromBase_3(bytes0, bytes0.length);
  }

  private native long GetRootElement_4();
  public vtkXMLDataElement GetRootElement()
  {
    long temp = GetRootElement_4();

    if (temp == 0) return null;
    return (vtkXMLDataElement)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetCompressor_5(vtkDataCompressor id0);
  public void SetCompressor(vtkDataCompressor id0)
  {
    SetCompressor_5(id0);
  }

  private native long GetCompressor_6();
  public vtkDataCompressor GetCompressor()
  {
    long temp = GetCompressor_6();

    if (temp == 0) return null;
    return (vtkDataCompressor)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native int Parse_7();
  public int Parse()
  {
    return Parse_7();
  }

  private native int GetAbort_8();
  public int GetAbort()
  {
    return GetAbort_8();
  }

  private native void SetAbort_9(int id0);
  public void SetAbort(int id0)
  {
    SetAbort_9(id0);
  }

  private native float GetProgress_10();
  public float GetProgress()
  {
    return GetProgress_10();
  }

  private native void SetProgress_11(float id0);
  public void SetProgress(float id0)
  {
    SetProgress_11(id0);
  }

  private native void SetAttributesEncoding_12(int id0);
  public void SetAttributesEncoding(int id0)
  {
    SetAttributesEncoding_12(id0);
  }

  private native int GetAttributesEncodingMinValue_13();
  public int GetAttributesEncodingMinValue()
  {
    return GetAttributesEncodingMinValue_13();
  }

  private native int GetAttributesEncodingMaxValue_14();
  public int GetAttributesEncodingMaxValue()
  {
    return GetAttributesEncodingMaxValue_14();
  }

  private native int GetAttributesEncoding_15();
  public int GetAttributesEncoding()
  {
    return GetAttributesEncoding_15();
  }

  private native void CharacterDataHandler_16(byte[] id0, int len0,int id1);
  public void CharacterDataHandler(String id0,int id1)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    CharacterDataHandler_16(bytes0, bytes0.length,id1);
  }

  private native long GetAppendedDataPosition_17();
  public long GetAppendedDataPosition()
  {
    return GetAppendedDataPosition_17();
  }

  public vtkXMLDataParser() { super(); }

  public vtkXMLDataParser(long id) { super(id); }
  public native long   VTKInit();

}
