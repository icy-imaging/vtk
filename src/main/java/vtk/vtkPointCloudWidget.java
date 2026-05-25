// java wrapper for vtkPointCloudWidget object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkPointCloudWidget extends vtkAbstractWidget
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

  private native void SetRepresentation_4(vtkPointCloudRepresentation id0);
  public void SetRepresentation(vtkPointCloudRepresentation id0)
  {
    SetRepresentation_4(id0);
  }

  private native void CreateDefaultRepresentation_5();
  public void CreateDefaultRepresentation()
  {
    CreateDefaultRepresentation_5();
  }

  private native void SetEnabled_6(int id0);
  public void SetEnabled(int id0)
  {
    SetEnabled_6(id0);
  }

  public vtkPointCloudWidget() { super(); }

  public vtkPointCloudWidget(long id) { super(id); }
  public native long   VTKInit();

}
