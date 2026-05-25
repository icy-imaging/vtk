// java wrapper for vtkProStarReader object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkProStarReader extends vtkUnstructuredGridAlgorithm
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

  private native void SetFileName_4(byte[] id0, int len0);
  public void SetFileName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetFileName_4(bytes0, bytes0.length);
  }

  private native byte[] GetFileName_5();
  public String GetFileName()
  {
    return new String(GetFileName_5(), StandardCharsets.UTF_8);
  }

  private native void SetScaleFactor_6(double id0);
  public void SetScaleFactor(double id0)
  {
    SetScaleFactor_6(id0);
  }

  private native double GetScaleFactorMinValue_7();
  public double GetScaleFactorMinValue()
  {
    return GetScaleFactorMinValue_7();
  }

  private native double GetScaleFactorMaxValue_8();
  public double GetScaleFactorMaxValue()
  {
    return GetScaleFactorMaxValue_8();
  }

  private native double GetScaleFactor_9();
  public double GetScaleFactor()
  {
    return GetScaleFactor_9();
  }

  public vtkProStarReader() { super(); }

  public vtkProStarReader(long id) { super(id); }
  public native long   VTKInit();

}
