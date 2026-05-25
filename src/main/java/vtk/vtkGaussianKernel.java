// java wrapper for vtkGaussianKernel object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkGaussianKernel extends vtkGeneralizedKernel
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

  private native void Initialize_4(vtkAbstractPointLocator id0,vtkDataSet id1,vtkPointData id2);
  public void Initialize(vtkAbstractPointLocator id0,vtkDataSet id1,vtkPointData id2)
  {
    Initialize_4(id0,id1,id2);
  }

  private native long ComputeWeights_5(double id0[],vtkIdList id1,vtkDoubleArray id2,vtkDoubleArray id3);
  public long ComputeWeights(double id0[],vtkIdList id1,vtkDoubleArray id2,vtkDoubleArray id3)
  {
    return ComputeWeights_5(id0,id1,id2,id3);
  }

  private native void SetSharpness_6(double id0);
  public void SetSharpness(double id0)
  {
    SetSharpness_6(id0);
  }

  private native double GetSharpnessMinValue_7();
  public double GetSharpnessMinValue()
  {
    return GetSharpnessMinValue_7();
  }

  private native double GetSharpnessMaxValue_8();
  public double GetSharpnessMaxValue()
  {
    return GetSharpnessMaxValue_8();
  }

  private native double GetSharpness_9();
  public double GetSharpness()
  {
    return GetSharpness_9();
  }

  private native long ComputeWeights_10(double id0[],vtkIdList id1,vtkDoubleArray id2);
  public long ComputeWeights(double id0[],vtkIdList id1,vtkDoubleArray id2)
  {
    return ComputeWeights_10(id0,id1,id2);
  }

  public vtkGaussianKernel() { super(); }

  public vtkGaussianKernel(long id) { super(id); }
  public native long   VTKInit();

}
