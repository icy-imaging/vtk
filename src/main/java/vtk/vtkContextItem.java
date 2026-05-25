// java wrapper for vtkContextItem object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkContextItem extends vtkAbstractContextItem
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

  private native double GetOpacity_4();
  public double GetOpacity()
  {
    return GetOpacity_4();
  }

  private native void SetOpacity_5(double id0);
  public void SetOpacity(double id0)
  {
    SetOpacity_5(id0);
  }

  private native void SetTransform_6(vtkContextTransform id0);
  public void SetTransform(vtkContextTransform id0)
  {
    SetTransform_6(id0);
  }

  public vtkContextItem() { super(); }

  public vtkContextItem(long id) { super(id); }

}
