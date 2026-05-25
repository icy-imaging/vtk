// java wrapper for vtkFixedSizeHandleRepresentation3D object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkFixedSizeHandleRepresentation3D extends vtkPolygonalHandleRepresentation3D
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

  private native long GetSphereSource_4();
  public vtkSphereSource GetSphereSource()
  {
    long temp = GetSphereSource_4();

    if (temp == 0) return null;
    return (vtkSphereSource)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetHandleSizeInPixels_5(double id0);
  public void SetHandleSizeInPixels(double id0)
  {
    SetHandleSizeInPixels_5(id0);
  }

  private native double GetHandleSizeInPixels_6();
  public double GetHandleSizeInPixels()
  {
    return GetHandleSizeInPixels_6();
  }

  private native void SetHandleSizeToleranceInPixels_7(double id0);
  public void SetHandleSizeToleranceInPixels(double id0)
  {
    SetHandleSizeToleranceInPixels_7(id0);
  }

  private native double GetHandleSizeToleranceInPixels_8();
  public double GetHandleSizeToleranceInPixels()
  {
    return GetHandleSizeToleranceInPixels_8();
  }

  public vtkFixedSizeHandleRepresentation3D() { super(); }

  public vtkFixedSizeHandleRepresentation3D(long id) { super(id); }
  public native long   VTKInit();

}
