// java wrapper for vtkMoleculeReaderBase object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkMoleculeReaderBase extends vtkPolyDataAlgorithm
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

  private native void SetBScale_6(double id0);
  public void SetBScale(double id0)
  {
    SetBScale_6(id0);
  }

  private native double GetBScale_7();
  public double GetBScale()
  {
    return GetBScale_7();
  }

  private native void SetHBScale_8(double id0);
  public void SetHBScale(double id0)
  {
    SetHBScale_8(id0);
  }

  private native double GetHBScale_9();
  public double GetHBScale()
  {
    return GetHBScale_9();
  }

  private native long GetNumberOfAtoms_10();
  public long GetNumberOfAtoms()
  {
    return GetNumberOfAtoms_10();
  }

  private native int GetNumberOfModels_11();
  public int GetNumberOfModels()
  {
    return GetNumberOfModels_11();
  }

  public vtkMoleculeReaderBase() { super(); }

  public vtkMoleculeReaderBase(long id) { super(id); }

}
