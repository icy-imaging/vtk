// java wrapper for vtkPolygonalHandleRepresentation3D object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkPolygonalHandleRepresentation3D extends vtkAbstractPolygonalHandleRepresentation3D
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

  private native void SetWorldPosition_4(double id0[]);
  public void SetWorldPosition(double id0[])
  {
    SetWorldPosition_4(id0);
  }

  private native void SetOffset_5(double id0,double id1,double id2);
  public void SetOffset(double id0,double id1,double id2)
  {
    SetOffset_5(id0,id1,id2);
  }

  private native void SetOffset_6(double id0[]);
  public void SetOffset(double id0[])
  {
    SetOffset_6(id0);
  }

  private native double[] GetOffset_7();
  public double[] GetOffset()
  {
    return GetOffset_7();
  }

  public vtkPolygonalHandleRepresentation3D() { super(); }

  public vtkPolygonalHandleRepresentation3D(long id) { super(id); }
  public native long   VTKInit();

}
