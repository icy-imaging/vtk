// java wrapper for vtkGeoTransform object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkGeoTransform extends vtkAbstractTransform
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

  private native void SetSourceProjection_4(vtkGeoProjection id0);
  public void SetSourceProjection(vtkGeoProjection id0)
  {
    SetSourceProjection_4(id0);
  }

  private native void SetSourceProjection_5(byte[] id0, int len0);
  public void SetSourceProjection(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetSourceProjection_5(bytes0, bytes0.length);
  }

  private native long GetSourceProjection_6();
  public vtkGeoProjection GetSourceProjection()
  {
    long temp = GetSourceProjection_6();

    if (temp == 0) return null;
    return (vtkGeoProjection)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetTransformZCoordinate_7(boolean id0);
  public void SetTransformZCoordinate(boolean id0)
  {
    SetTransformZCoordinate_7(id0);
  }

  private native boolean GetTransformZCoordinate_8();
  public boolean GetTransformZCoordinate()
  {
    return GetTransformZCoordinate_8();
  }

  private native void SetDestinationProjection_9(vtkGeoProjection id0);
  public void SetDestinationProjection(vtkGeoProjection id0)
  {
    SetDestinationProjection_9(id0);
  }

  private native void SetDestinationProjection_10(byte[] id0, int len0);
  public void SetDestinationProjection(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetDestinationProjection_10(bytes0, bytes0.length);
  }

  private native long GetDestinationProjection_11();
  public vtkGeoProjection GetDestinationProjection()
  {
    long temp = GetDestinationProjection_11();

    if (temp == 0) return null;
    return (vtkGeoProjection)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void TransformPoints_12(vtkPoints id0,vtkPoints id1);
  public void TransformPoints(vtkPoints id0,vtkPoints id1)
  {
    TransformPoints_12(id0,id1);
  }

  private native void Inverse_13();
  public void Inverse()
  {
    Inverse_13();
  }

  private native void InternalTransformPoint_14(float id0[],float id1[]);
  public void InternalTransformPoint(float id0[],float id1[])
  {
    InternalTransformPoint_14(id0,id1);
  }

  private native void InternalTransformPoint_15(double id0[],double id1[]);
  public void InternalTransformPoint(double id0[],double id1[])
  {
    InternalTransformPoint_15(id0,id1);
  }

  private native int ComputeUTMZone_16(double id0,double id1);
  public int ComputeUTMZone(double id0,double id1)
  {
    return ComputeUTMZone_16(id0,id1);
  }

  private native long MakeTransform_17();
  public vtkAbstractTransform MakeTransform()
  {
    long temp = MakeTransform_17();

    if (temp == 0) return null;
    return (vtkAbstractTransform)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  public vtkGeoTransform() { super(); }

  public vtkGeoTransform(long id) { super(id); }
  public native long   VTKInit();

}
