// java wrapper for vtkTecplotReader object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkTecplotReader extends vtkMultiBlockDataSetAlgorithm
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

  private native int GetNumberOfVariables_4();
  public int GetNumberOfVariables()
  {
    return GetNumberOfVariables_4();
  }

  private native void SetFileName_5(byte[] id0, int len0);
  public void SetFileName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetFileName_5(bytes0, bytes0.length);
  }

  private native byte[] GetDataTitle_6();
  public String GetDataTitle()
  {
    return new String(GetDataTitle_6(), StandardCharsets.UTF_8);
  }

  private native int GetNumberOfBlocks_7();
  public int GetNumberOfBlocks()
  {
    return GetNumberOfBlocks_7();
  }

  private native byte[] GetBlockName_8(int id0);
  public String GetBlockName(int id0)
  {
    return new String(GetBlockName_8(id0), StandardCharsets.UTF_8);
  }

  private native int GetNumberOfDataAttributes_9();
  public int GetNumberOfDataAttributes()
  {
    return GetNumberOfDataAttributes_9();
  }

  private native byte[] GetDataAttributeName_10(int id0);
  public String GetDataAttributeName(int id0)
  {
    return new String(GetDataAttributeName_10(id0), StandardCharsets.UTF_8);
  }

  private native int IsDataAttributeCellBased_11(byte[] id0, int len0);
  public int IsDataAttributeCellBased(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return IsDataAttributeCellBased_11(bytes0, bytes0.length);
  }

  private native int IsDataAttributeCellBased_12(int id0);
  public int IsDataAttributeCellBased(int id0)
  {
    return IsDataAttributeCellBased_12(id0);
  }

  private native int GetNumberOfDataArrays_13();
  public int GetNumberOfDataArrays()
  {
    return GetNumberOfDataArrays_13();
  }

  private native byte[] GetDataArrayName_14(int id0);
  public String GetDataArrayName(int id0)
  {
    return new String(GetDataArrayName_14(id0), StandardCharsets.UTF_8);
  }

  private native int GetDataArrayStatus_15(byte[] id0, int len0);
  public int GetDataArrayStatus(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return GetDataArrayStatus_15(bytes0, bytes0.length);
  }

  private native void SetDataArrayStatus_16(byte[] id0, int len0,int id1);
  public void SetDataArrayStatus(String id0,int id1)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetDataArrayStatus_16(bytes0, bytes0.length,id1);
  }

  public vtkTecplotReader() { super(); }

  public vtkTecplotReader(long id) { super(id); }
  public native long   VTKInit();

}
