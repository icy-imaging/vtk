// java wrapper for vtkMoleculeToAtomBallFilter object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkMoleculeToAtomBallFilter extends vtkMoleculeToPolyDataFilter
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

  private native int GetRadiusSource_4();
  public int GetRadiusSource()
  {
    return GetRadiusSource_4();
  }

  private native void SetRadiusSource_5(int id0);
  public void SetRadiusSource(int id0)
  {
    SetRadiusSource_5(id0);
  }

  private native int GetResolution_6();
  public int GetResolution()
  {
    return GetResolution_6();
  }

  private native void SetResolution_7(int id0);
  public void SetResolution(int id0)
  {
    SetResolution_7(id0);
  }

  private native double GetRadiusScale_8();
  public double GetRadiusScale()
  {
    return GetRadiusScale_8();
  }

  private native void SetRadiusScale_9(double id0);
  public void SetRadiusScale(double id0)
  {
    SetRadiusScale_9(id0);
  }

  public vtkMoleculeToAtomBallFilter() { super(); }

  public vtkMoleculeToAtomBallFilter(long id) { super(id); }
  public native long   VTKInit();

}
