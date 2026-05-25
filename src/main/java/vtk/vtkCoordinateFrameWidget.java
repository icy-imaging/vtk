// java wrapper for vtkCoordinateFrameWidget object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkCoordinateFrameWidget extends vtkAbstractWidget
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

  private native void SetRepresentation_4(vtkCoordinateFrameRepresentation id0);
  public void SetRepresentation(vtkCoordinateFrameRepresentation id0)
  {
    SetRepresentation_4(id0);
  }

  private native void SetEnabled_5(int id0);
  public void SetEnabled(int id0)
  {
    SetEnabled_5(id0);
  }

  private native long GetCoordinateFrameRepresentation_6();
  public vtkCoordinateFrameRepresentation GetCoordinateFrameRepresentation()
  {
    long temp = GetCoordinateFrameRepresentation_6();

    if (temp == 0) return null;
    return (vtkCoordinateFrameRepresentation)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void CreateDefaultRepresentation_7();
  public void CreateDefaultRepresentation()
  {
    CreateDefaultRepresentation_7();
  }

  public vtkCoordinateFrameWidget() { super(); }

  public vtkCoordinateFrameWidget(long id) { super(id); }
  public native long   VTKInit();

}
