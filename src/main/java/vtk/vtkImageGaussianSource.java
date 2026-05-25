// java wrapper for vtkImageGaussianSource object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkImageGaussianSource extends vtkImageAlgorithm
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

  private native void SetWholeExtent_4(int id0,int id1,int id2,int id3,int id4,int id5);
  public void SetWholeExtent(int id0,int id1,int id2,int id3,int id4,int id5)
  {
    SetWholeExtent_4(id0,id1,id2,id3,id4,id5);
  }

  private native void SetCenter_5(double id0,double id1,double id2);
  public void SetCenter(double id0,double id1,double id2)
  {
    SetCenter_5(id0,id1,id2);
  }

  private native void SetCenter_6(double id0[]);
  public void SetCenter(double id0[])
  {
    SetCenter_6(id0);
  }

  private native double[] GetCenter_7();
  public double[] GetCenter()
  {
    return GetCenter_7();
  }

  private native void SetMaximum_8(double id0);
  public void SetMaximum(double id0)
  {
    SetMaximum_8(id0);
  }

  private native double GetMaximum_9();
  public double GetMaximum()
  {
    return GetMaximum_9();
  }

  private native void SetStandardDeviation_10(double id0);
  public void SetStandardDeviation(double id0)
  {
    SetStandardDeviation_10(id0);
  }

  private native double GetStandardDeviation_11();
  public double GetStandardDeviation()
  {
    return GetStandardDeviation_11();
  }

  public vtkImageGaussianSource() { super(); }

  public vtkImageGaussianSource(long id) { super(id); }
  public native long   VTKInit();

}
