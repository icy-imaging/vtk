// java wrapper for vtkNamedColors object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkNamedColors extends vtkObject
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

  private native int GetNumberOfColors_4();
  public int GetNumberOfColors()
  {
    return GetNumberOfColors_4();
  }

  private native void ResetColors_5();
  public void ResetColors()
  {
    ResetColors_5();
  }

  private native boolean ColorExists_6(byte[] id0, int len0);
  public boolean ColorExists(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return ColorExists_6(bytes0, bytes0.length);
  }

  private native void GetColor_7(byte[] id0, int len0,double id1[]);
  public void GetColor(String id0,double id1[])
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    GetColor_7(bytes0, bytes0.length,id1);
  }

  private native void GetColorRGB_8(byte[] id0, int len0,double id1[]);
  public void GetColorRGB(String id0,double id1[])
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    GetColorRGB_8(bytes0, bytes0.length,id1);
  }

  private native void SetColor_9(byte[] id0, int len0,double id1[]);
  public void SetColor(String id0,double id1[])
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetColor_9(bytes0, bytes0.length,id1);
  }

  private native void RemoveColor_10(byte[] id0, int len0);
  public void RemoveColor(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    RemoveColor_10(bytes0, bytes0.length);
  }

  private native byte[] GetColorNames_11();
  public String GetColorNames()
  {
    return new String(GetColorNames_11(), StandardCharsets.UTF_8);
  }

  private native void GetColorNames_12(vtkStringArray id0);
  public void GetColorNames(vtkStringArray id0)
  {
    GetColorNames_12(id0);
  }

  private native byte[] GetSynonyms_13();
  public String GetSynonyms()
  {
    return new String(GetSynonyms_13(), StandardCharsets.UTF_8);
  }

  private native void SetColor_14(byte[] id0, int len0,byte[] id1, int len1);
  public void SetColor(String id0,String id1)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    byte[] bytes1 = id1.getBytes(StandardCharsets.UTF_8);
    SetColor_14(bytes0, bytes0.length,bytes1, bytes1.length);
  }

  public vtkNamedColors() { super(); }

  public vtkNamedColors(long id) { super(id); }
  public native long   VTKInit();

}
