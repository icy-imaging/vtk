// java wrapper for vtkVoxelGrid object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkVoxelGrid extends vtkPolyDataAlgorithm
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

  private native void SetConfigurationStyle_4(int id0);
  public void SetConfigurationStyle(int id0)
  {
    SetConfigurationStyle_4(id0);
  }

  private native int GetConfigurationStyle_5();
  public int GetConfigurationStyle()
  {
    return GetConfigurationStyle_5();
  }

  private native void SetConfigurationStyleToManual_6();
  public void SetConfigurationStyleToManual()
  {
    SetConfigurationStyleToManual_6();
  }

  private native void SetConfigurationStyleToLeafSize_7();
  public void SetConfigurationStyleToLeafSize()
  {
    SetConfigurationStyleToLeafSize_7();
  }

  private native void SetConfigurationStyleToAutomatic_8();
  public void SetConfigurationStyleToAutomatic()
  {
    SetConfigurationStyleToAutomatic_8();
  }

  private native void SetDivisions_9(int id0,int id1,int id2);
  public void SetDivisions(int id0,int id1,int id2)
  {
    SetDivisions_9(id0,id1,id2);
  }

  private native void SetDivisions_10(int id0[]);
  public void SetDivisions(int id0[])
  {
    SetDivisions_10(id0);
  }

  private native int[] GetDivisions_11();
  public int[] GetDivisions()
  {
    return GetDivisions_11();
  }

  private native void SetLeafSize_12(double id0,double id1,double id2);
  public void SetLeafSize(double id0,double id1,double id2)
  {
    SetLeafSize_12(id0,id1,id2);
  }

  private native void SetLeafSize_13(double id0[]);
  public void SetLeafSize(double id0[])
  {
    SetLeafSize_13(id0);
  }

  private native double[] GetLeafSize_14();
  public double[] GetLeafSize()
  {
    return GetLeafSize_14();
  }

  private native void SetNumberOfPointsPerBin_15(int id0);
  public void SetNumberOfPointsPerBin(int id0)
  {
    SetNumberOfPointsPerBin_15(id0);
  }

  private native int GetNumberOfPointsPerBinMinValue_16();
  public int GetNumberOfPointsPerBinMinValue()
  {
    return GetNumberOfPointsPerBinMinValue_16();
  }

  private native int GetNumberOfPointsPerBinMaxValue_17();
  public int GetNumberOfPointsPerBinMaxValue()
  {
    return GetNumberOfPointsPerBinMaxValue_17();
  }

  private native int GetNumberOfPointsPerBin_18();
  public int GetNumberOfPointsPerBin()
  {
    return GetNumberOfPointsPerBin_18();
  }

  private native void SetKernel_19(vtkInterpolationKernel id0);
  public void SetKernel(vtkInterpolationKernel id0)
  {
    SetKernel_19(id0);
  }

  private native long GetKernel_20();
  public vtkInterpolationKernel GetKernel()
  {
    long temp = GetKernel_20();

    if (temp == 0) return null;
    return (vtkInterpolationKernel)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  public vtkVoxelGrid() { super(); }

  public vtkVoxelGrid(long id) { super(id); }
  public native long   VTKInit();

}
