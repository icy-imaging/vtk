// java wrapper for vtkProteinRibbonFilter object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkProteinRibbonFilter extends vtkPolyDataAlgorithm
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

  private native float GetCoilWidth_4();
  public float GetCoilWidth()
  {
    return GetCoilWidth_4();
  }

  private native void SetCoilWidth_5(float id0);
  public void SetCoilWidth(float id0)
  {
    SetCoilWidth_5(id0);
  }

  private native float GetHelixWidth_6();
  public float GetHelixWidth()
  {
    return GetHelixWidth_6();
  }

  private native void SetHelixWidth_7(float id0);
  public void SetHelixWidth(float id0)
  {
    SetHelixWidth_7(id0);
  }

  private native int GetSubdivideFactor_8();
  public int GetSubdivideFactor()
  {
    return GetSubdivideFactor_8();
  }

  private native void SetSubdivideFactor_9(int id0);
  public void SetSubdivideFactor(int id0)
  {
    SetSubdivideFactor_9(id0);
  }

  private native boolean GetDrawSmallMoleculesAsSpheres_10();
  public boolean GetDrawSmallMoleculesAsSpheres()
  {
    return GetDrawSmallMoleculesAsSpheres_10();
  }

  private native void SetDrawSmallMoleculesAsSpheres_11(boolean id0);
  public void SetDrawSmallMoleculesAsSpheres(boolean id0)
  {
    SetDrawSmallMoleculesAsSpheres_11(id0);
  }

  private native int GetSphereResolution_12();
  public int GetSphereResolution()
  {
    return GetSphereResolution_12();
  }

  private native void SetSphereResolution_13(int id0);
  public void SetSphereResolution(int id0)
  {
    SetSphereResolution_13(id0);
  }

  public vtkProteinRibbonFilter() { super(); }

  public vtkProteinRibbonFilter(long id) { super(id); }
  public native long   VTKInit();

}
