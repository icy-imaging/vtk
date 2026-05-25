// java wrapper for vtkAbstractMapper3D object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkAbstractMapper3D extends vtkAbstractMapper
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

  private native double[] GetBounds_4();
  public double[] GetBounds()
  {
    return GetBounds_4();
  }

  private native void GetBounds_5(double id0[]);
  public void GetBounds(double id0[])
  {
    GetBounds_5(id0);
  }

  private native double[] GetCenter_6();
  public double[] GetCenter()
  {
    return GetCenter_6();
  }

  private native void GetCenter_7(double id0[]);
  public void GetCenter(double id0[])
  {
    GetCenter_7(id0);
  }

  private native double GetLength_8();
  public double GetLength()
  {
    return GetLength_8();
  }

  private native int IsARayCastMapper_9();
  public int IsARayCastMapper()
  {
    return IsARayCastMapper_9();
  }

  private native int IsARenderIntoImageMapper_10();
  public int IsARenderIntoImageMapper()
  {
    return IsARenderIntoImageMapper_10();
  }

  private native void GetClippingPlaneInDataCoords_11(vtkMatrix4x4 id0,int id1,double id2[]);
  public void GetClippingPlaneInDataCoords(vtkMatrix4x4 id0,int id1,double id2[])
  {
    GetClippingPlaneInDataCoords_11(id0,id1,id2);
  }

  public vtkAbstractMapper3D() { super(); }

  public vtkAbstractMapper3D(long id) { super(id); }

}
