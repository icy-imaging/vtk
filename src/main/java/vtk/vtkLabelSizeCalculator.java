// java wrapper for vtkLabelSizeCalculator object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkLabelSizeCalculator extends vtkPassInputTypeAlgorithm
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

  private native void SetFontProperty_4(vtkTextProperty id0,int id1);
  public void SetFontProperty(vtkTextProperty id0,int id1)
  {
    SetFontProperty_4(id0,id1);
  }

  private native long GetFontProperty_5(int id0);
  public vtkTextProperty GetFontProperty(int id0)
  {
    long temp = GetFontProperty_5(id0);

    if (temp == 0) return null;
    return (vtkTextProperty)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetLabelSizeArrayName_6(byte[] id0, int len0);
  public void SetLabelSizeArrayName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetLabelSizeArrayName_6(bytes0, bytes0.length);
  }

  private native byte[] GetLabelSizeArrayName_7();
  public String GetLabelSizeArrayName()
  {
    return new String(GetLabelSizeArrayName_7(), StandardCharsets.UTF_8);
  }

  private native void SetDPI_8(int id0);
  public void SetDPI(int id0)
  {
    SetDPI_8(id0);
  }

  private native int GetDPI_9();
  public int GetDPI()
  {
    return GetDPI_9();
  }

  public vtkLabelSizeCalculator() { super(); }

  public vtkLabelSizeCalculator(long id) { super(id); }
  public native long   VTKInit();

}
