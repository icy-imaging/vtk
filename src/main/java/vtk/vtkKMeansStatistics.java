// java wrapper for vtkKMeansStatistics object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkKMeansStatistics extends vtkStatisticsAlgorithm
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

  private native void SetDistanceFunctor_4(vtkKMeansDistanceFunctor id0);
  public void SetDistanceFunctor(vtkKMeansDistanceFunctor id0)
  {
    SetDistanceFunctor_4(id0);
  }

  private native long GetDistanceFunctor_5();
  public vtkKMeansDistanceFunctor GetDistanceFunctor()
  {
    long temp = GetDistanceFunctor_5();

    if (temp == 0) return null;
    return (vtkKMeansDistanceFunctor)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetDefaultNumberOfClusters_6(int id0);
  public void SetDefaultNumberOfClusters(int id0)
  {
    SetDefaultNumberOfClusters_6(id0);
  }

  private native int GetDefaultNumberOfClusters_7();
  public int GetDefaultNumberOfClusters()
  {
    return GetDefaultNumberOfClusters_7();
  }

  private native void SetKValuesArrayName_8(byte[] id0, int len0);
  public void SetKValuesArrayName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetKValuesArrayName_8(bytes0, bytes0.length);
  }

  private native byte[] GetKValuesArrayName_9();
  public String GetKValuesArrayName()
  {
    return new String(GetKValuesArrayName_9(), StandardCharsets.UTF_8);
  }

  private native void SetMaxNumIterations_10(int id0);
  public void SetMaxNumIterations(int id0)
  {
    SetMaxNumIterations_10(id0);
  }

  private native int GetMaxNumIterations_11();
  public int GetMaxNumIterations()
  {
    return GetMaxNumIterations_11();
  }

  private native void SetTolerance_12(double id0);
  public void SetTolerance(double id0)
  {
    SetTolerance_12(id0);
  }

  private native double GetTolerance_13();
  public double GetTolerance()
  {
    return GetTolerance_13();
  }

  private native void Aggregate_14(vtkDataObjectCollection id0,vtkMultiBlockDataSet id1);
  public void Aggregate(vtkDataObjectCollection id0,vtkMultiBlockDataSet id1)
  {
    Aggregate_14(id0,id1);
  }

  private native void SetGhostsToSkip_15(byte id0);
  public void SetGhostsToSkip(byte id0)
  {
    SetGhostsToSkip_15(id0);
  }

  private native byte GetGhostsToSkip_16();
  public byte GetGhostsToSkip()
  {
    return GetGhostsToSkip_16();
  }

  public vtkKMeansStatistics() { super(); }

  public vtkKMeansStatistics(long id) { super(id); }
  public native long   VTKInit();

}
