// java wrapper for vtkProjectPointsToPlane object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkProjectPointsToPlane extends vtkPointSetAlgorithm
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

  private native void SetProjectionType_4(int id0);
  public void SetProjectionType(int id0)
  {
    SetProjectionType_4(id0);
  }

  private native int GetProjectionTypeMinValue_5();
  public int GetProjectionTypeMinValue()
  {
    return GetProjectionTypeMinValue_5();
  }

  private native int GetProjectionTypeMaxValue_6();
  public int GetProjectionTypeMaxValue()
  {
    return GetProjectionTypeMaxValue_6();
  }

  private native int GetProjectionType_7();
  public int GetProjectionType()
  {
    return GetProjectionType_7();
  }

  private native void SetProjectionTypeToXPlane_8();
  public void SetProjectionTypeToXPlane()
  {
    SetProjectionTypeToXPlane_8();
  }

  private native void SetProjectionTypeToYPlane_9();
  public void SetProjectionTypeToYPlane()
  {
    SetProjectionTypeToYPlane_9();
  }

  private native void SetProjectionTypeToZPlane_10();
  public void SetProjectionTypeToZPlane()
  {
    SetProjectionTypeToZPlane_10();
  }

  private native void SetProjectionTypeToSpecifiedPlane_11();
  public void SetProjectionTypeToSpecifiedPlane()
  {
    SetProjectionTypeToSpecifiedPlane_11();
  }

  private native void SetProjectionTypeToBestCoordinatePlane_12();
  public void SetProjectionTypeToBestCoordinatePlane()
  {
    SetProjectionTypeToBestCoordinatePlane_12();
  }

  private native void SetProjectionTypeToBestFitPlane_13();
  public void SetProjectionTypeToBestFitPlane()
  {
    SetProjectionTypeToBestFitPlane_13();
  }

  private native void SetOrigin_14(double id0,double id1,double id2);
  public void SetOrigin(double id0,double id1,double id2)
  {
    SetOrigin_14(id0,id1,id2);
  }

  private native void SetOrigin_15(double id0[]);
  public void SetOrigin(double id0[])
  {
    SetOrigin_15(id0);
  }

  private native void SetNormal_16(double id0,double id1,double id2);
  public void SetNormal(double id0,double id1,double id2)
  {
    SetNormal_16(id0,id1,id2);
  }

  private native void SetNormal_17(double id0[]);
  public void SetNormal(double id0[])
  {
    SetNormal_17(id0);
  }

  private native double[] GetOrigin_18();
  public double[] GetOrigin()
  {
    return GetOrigin_18();
  }

  private native double[] GetNormal_19();
  public double[] GetNormal()
  {
    return GetNormal_19();
  }

  private native void SetOutputPointsPrecision_20(int id0);
  public void SetOutputPointsPrecision(int id0)
  {
    SetOutputPointsPrecision_20(id0);
  }

  private native int GetOutputPointsPrecision_21();
  public int GetOutputPointsPrecision()
  {
    return GetOutputPointsPrecision_21();
  }

  public vtkProjectPointsToPlane() { super(); }

  public vtkProjectPointsToPlane(long id) { super(id); }
  public native long   VTKInit();

}
