// java wrapper for vtkImageActorPointPlacer object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkImageActorPointPlacer extends vtkPointPlacer
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

  private native int ComputeWorldPosition_4(vtkRenderer id0,double id1[],double id2[],double id3[]);
  public int ComputeWorldPosition(vtkRenderer id0,double id1[],double id2[],double id3[])
  {
    return ComputeWorldPosition_4(id0,id1,id2,id3);
  }

  private native int ComputeWorldPosition_5(vtkRenderer id0,double id1[],double id2[],double id3[],double id4[]);
  public int ComputeWorldPosition(vtkRenderer id0,double id1[],double id2[],double id3[],double id4[])
  {
    return ComputeWorldPosition_5(id0,id1,id2,id3,id4);
  }

  private native int ValidateWorldPosition_6(double id0[]);
  public int ValidateWorldPosition(double id0[])
  {
    return ValidateWorldPosition_6(id0);
  }

  private native int ValidateWorldPosition_7(double id0[],double id1[]);
  public int ValidateWorldPosition(double id0[],double id1[])
  {
    return ValidateWorldPosition_7(id0,id1);
  }

  private native int UpdateWorldPosition_8(vtkRenderer id0,double id1[],double id2[]);
  public int UpdateWorldPosition(vtkRenderer id0,double id1[],double id2[])
  {
    return UpdateWorldPosition_8(id0,id1,id2);
  }

  private native int UpdateInternalState_9();
  public int UpdateInternalState()
  {
    return UpdateInternalState_9();
  }

  private native void SetImageActor_10(vtkImageActor id0);
  public void SetImageActor(vtkImageActor id0)
  {
    SetImageActor_10(id0);
  }

  private native long GetImageActor_11();
  public vtkImageActor GetImageActor()
  {
    long temp = GetImageActor_11();

    if (temp == 0) return null;
    return (vtkImageActor)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetBounds_12(double id0,double id1,double id2,double id3,double id4,double id5);
  public void SetBounds(double id0,double id1,double id2,double id3,double id4,double id5)
  {
    SetBounds_12(id0,id1,id2,id3,id4,id5);
  }

  private native void SetBounds_13(double id0[]);
  public void SetBounds(double id0[])
  {
    SetBounds_13(id0);
  }

  private native double[] GetBounds_14();
  public double[] GetBounds()
  {
    return GetBounds_14();
  }

  private native void SetWorldTolerance_15(double id0);
  public void SetWorldTolerance(double id0)
  {
    SetWorldTolerance_15(id0);
  }

  public vtkImageActorPointPlacer() { super(); }

  public vtkImageActorPointPlacer(long id) { super(id); }
  public native long   VTKInit();

}
