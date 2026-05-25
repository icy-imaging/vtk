// java wrapper for vtkColorSeries object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkColorSeries extends vtkObject
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

  private native void SetColorScheme_4(int id0);
  public void SetColorScheme(int id0)
  {
    SetColorScheme_4(id0);
  }

  private native int SetColorSchemeByName_5(byte[] id0, int len0);
  public int SetColorSchemeByName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return SetColorSchemeByName_5(bytes0, bytes0.length);
  }

  private native int GetNumberOfColorSchemes_6();
  public int GetNumberOfColorSchemes()
  {
    return GetNumberOfColorSchemes_6();
  }

  private native byte[] GetColorSchemeName_7();
  public String GetColorSchemeName()
  {
    return new String(GetColorSchemeName_7(), StandardCharsets.UTF_8);
  }

  private native void SetColorSchemeName_8(byte[] id0, int len0);
  public void SetColorSchemeName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetColorSchemeName_8(bytes0, bytes0.length);
  }

  private native int GetColorScheme_9();
  public int GetColorScheme()
  {
    return GetColorScheme_9();
  }

  private native int GetNumberOfColors_10();
  public int GetNumberOfColors()
  {
    return GetNumberOfColors_10();
  }

  private native void SetNumberOfColors_11(int id0);
  public void SetNumberOfColors(int id0)
  {
    SetNumberOfColors_11(id0);
  }

  private native void RemoveColor_12(int id0);
  public void RemoveColor(int id0)
  {
    RemoveColor_12(id0);
  }

  private native void ClearColors_13();
  public void ClearColors()
  {
    ClearColors_13();
  }

  private native void DeepCopy_14(vtkColorSeries id0);
  public void DeepCopy(vtkColorSeries id0)
  {
    DeepCopy_14(id0);
  }

  private native void BuildLookupTable_15(vtkLookupTable id0,int id1);
  public void BuildLookupTable(vtkLookupTable id0,int id1)
  {
    BuildLookupTable_15(id0,id1);
  }

  private native long CreateLookupTable_16(int id0);
  public vtkLookupTable CreateLookupTable(int id0)
  {
    long temp = CreateLookupTable_16(id0);

    if (temp == 0) return null;
    return (vtkLookupTable)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  public vtkColorSeries() { super(); }

  public vtkColorSeries(long id) { super(id); }
  public native long   VTKInit();

}
