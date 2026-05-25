// java wrapper for vtkLinearCellExtrusionFilter object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkLinearCellExtrusionFilter extends vtkPolyDataAlgorithm
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

  private native void SetScaleFactor_4(double id0);
  public void SetScaleFactor(double id0)
  {
    SetScaleFactor_4(id0);
  }

  private native double GetScaleFactor_5();
  public double GetScaleFactor()
  {
    return GetScaleFactor_5();
  }

  private native void SetUseUserVector_6(boolean id0);
  public void SetUseUserVector(boolean id0)
  {
    SetUseUserVector_6(id0);
  }

  private native boolean GetUseUserVector_7();
  public boolean GetUseUserVector()
  {
    return GetUseUserVector_7();
  }

  private native void UseUserVectorOn_8();
  public void UseUserVectorOn()
  {
    UseUserVectorOn_8();
  }

  private native void UseUserVectorOff_9();
  public void UseUserVectorOff()
  {
    UseUserVectorOff_9();
  }

  private native void SetUserVector_10(double id0,double id1,double id2);
  public void SetUserVector(double id0,double id1,double id2)
  {
    SetUserVector_10(id0,id1,id2);
  }

  private native void SetUserVector_11(double id0[]);
  public void SetUserVector(double id0[])
  {
    SetUserVector_11(id0);
  }

  private native double[] GetUserVector_12();
  public double[] GetUserVector()
  {
    return GetUserVector_12();
  }

  private native void SetMergeDuplicatePoints_13(boolean id0);
  public void SetMergeDuplicatePoints(boolean id0)
  {
    SetMergeDuplicatePoints_13(id0);
  }

  private native boolean GetMergeDuplicatePoints_14();
  public boolean GetMergeDuplicatePoints()
  {
    return GetMergeDuplicatePoints_14();
  }

  private native void MergeDuplicatePointsOn_15();
  public void MergeDuplicatePointsOn()
  {
    MergeDuplicatePointsOn_15();
  }

  private native void MergeDuplicatePointsOff_16();
  public void MergeDuplicatePointsOff()
  {
    MergeDuplicatePointsOff_16();
  }

  private native long GetLocator_17();
  public vtkIncrementalPointLocator GetLocator()
  {
    long temp = GetLocator_17();

    if (temp == 0) return null;
    return (vtkIncrementalPointLocator)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetLocator_18(vtkIncrementalPointLocator id0);
  public void SetLocator(vtkIncrementalPointLocator id0)
  {
    SetLocator_18(id0);
  }

  private native void CreateDefaultLocator_19();
  public void CreateDefaultLocator()
  {
    CreateDefaultLocator_19();
  }

  public vtkLinearCellExtrusionFilter() { super(); }

  public vtkLinearCellExtrusionFilter(long id) { super(id); }
  public native long   VTKInit();

}
