// java wrapper for vtkPointSetToMoleculeFilter object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkPointSetToMoleculeFilter extends vtkMoleculeAlgorithm
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

  private native boolean GetConvertLinesIntoBonds_4();
  public boolean GetConvertLinesIntoBonds()
  {
    return GetConvertLinesIntoBonds_4();
  }

  private native void SetConvertLinesIntoBonds_5(boolean id0);
  public void SetConvertLinesIntoBonds(boolean id0)
  {
    SetConvertLinesIntoBonds_5(id0);
  }

  private native void ConvertLinesIntoBondsOn_6();
  public void ConvertLinesIntoBondsOn()
  {
    ConvertLinesIntoBondsOn_6();
  }

  private native void ConvertLinesIntoBondsOff_7();
  public void ConvertLinesIntoBondsOff()
  {
    ConvertLinesIntoBondsOff_7();
  }

  public vtkPointSetToMoleculeFilter() { super(); }

  public vtkPointSetToMoleculeFilter(long id) { super(id); }
  public native long   VTKInit();

}
