// java wrapper for vtkImageWeightedSum object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkImageWeightedSum extends vtkThreadedImageAlgorithm
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

  private native void SetWeights_4(vtkDoubleArray id0);
  public void SetWeights(vtkDoubleArray id0)
  {
    SetWeights_4(id0);
  }

  private native long GetWeights_5();
  public vtkDoubleArray GetWeights()
  {
    long temp = GetWeights_5();

    if (temp == 0) return null;
    return (vtkDoubleArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetWeight_6(long id0,double id1);
  public void SetWeight(long id0,double id1)
  {
    SetWeight_6(id0,id1);
  }

  private native int GetNormalizeByWeight_7();
  public int GetNormalizeByWeight()
  {
    return GetNormalizeByWeight_7();
  }

  private native void SetNormalizeByWeight_8(int id0);
  public void SetNormalizeByWeight(int id0)
  {
    SetNormalizeByWeight_8(id0);
  }

  private native int GetNormalizeByWeightMinValue_9();
  public int GetNormalizeByWeightMinValue()
  {
    return GetNormalizeByWeightMinValue_9();
  }

  private native int GetNormalizeByWeightMaxValue_10();
  public int GetNormalizeByWeightMaxValue()
  {
    return GetNormalizeByWeightMaxValue_10();
  }

  private native void NormalizeByWeightOn_11();
  public void NormalizeByWeightOn()
  {
    NormalizeByWeightOn_11();
  }

  private native void NormalizeByWeightOff_12();
  public void NormalizeByWeightOff()
  {
    NormalizeByWeightOff_12();
  }

  private native double CalculateTotalWeight_13();
  public double CalculateTotalWeight()
  {
    return CalculateTotalWeight_13();
  }

  public vtkImageWeightedSum() { super(); }

  public vtkImageWeightedSum(long id) { super(id); }
  public native long   VTKInit();

}
