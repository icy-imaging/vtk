// java wrapper for vtkImageSinusoidSource object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkImageSinusoidSource extends vtkImageAlgorithm
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

  private native void SetDirection_5(double id0,double id1,double id2);
  public void SetDirection(double id0,double id1,double id2)
  {
    SetDirection_5(id0,id1,id2);
  }

  private native void SetDirection_6(double id0[]);
  public void SetDirection(double id0[])
  {
    SetDirection_6(id0);
  }

  private native double[] GetDirection_7();
  public double[] GetDirection()
  {
    return GetDirection_7();
  }

  private native void SetPeriod_8(double id0);
  public void SetPeriod(double id0)
  {
    SetPeriod_8(id0);
  }

  private native double GetPeriod_9();
  public double GetPeriod()
  {
    return GetPeriod_9();
  }

  private native void SetPhase_10(double id0);
  public void SetPhase(double id0)
  {
    SetPhase_10(id0);
  }

  private native double GetPhase_11();
  public double GetPhase()
  {
    return GetPhase_11();
  }

  private native void SetAmplitude_12(double id0);
  public void SetAmplitude(double id0)
  {
    SetAmplitude_12(id0);
  }

  private native double GetAmplitude_13();
  public double GetAmplitude()
  {
    return GetAmplitude_13();
  }

  public vtkImageSinusoidSource() { super(); }

  public vtkImageSinusoidSource(long id) { super(id); }
  public native long   VTKInit();

}
