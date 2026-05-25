// java wrapper for vtkExtentTranslator object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkExtentTranslator extends vtkObject
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

  private native void SetWholeExtent_5(int id0[]);
  public void SetWholeExtent(int id0[])
  {
    SetWholeExtent_5(id0);
  }

  private native int[] GetWholeExtent_6();
  public int[] GetWholeExtent()
  {
    return GetWholeExtent_6();
  }

  private native void SetExtent_7(int id0,int id1,int id2,int id3,int id4,int id5);
  public void SetExtent(int id0,int id1,int id2,int id3,int id4,int id5)
  {
    SetExtent_7(id0,id1,id2,id3,id4,id5);
  }

  private native void SetExtent_8(int id0[]);
  public void SetExtent(int id0[])
  {
    SetExtent_8(id0);
  }

  private native int[] GetExtent_9();
  public int[] GetExtent()
  {
    return GetExtent_9();
  }

  private native void SetPiece_10(int id0);
  public void SetPiece(int id0)
  {
    SetPiece_10(id0);
  }

  private native int GetPiece_11();
  public int GetPiece()
  {
    return GetPiece_11();
  }

  private native void SetNumberOfPieces_12(int id0);
  public void SetNumberOfPieces(int id0)
  {
    SetNumberOfPieces_12(id0);
  }

  private native int GetNumberOfPieces_13();
  public int GetNumberOfPieces()
  {
    return GetNumberOfPieces_13();
  }

  private native void SetGhostLevel_14(int id0);
  public void SetGhostLevel(int id0)
  {
    SetGhostLevel_14(id0);
  }

  private native int GetGhostLevel_15();
  public int GetGhostLevel()
  {
    return GetGhostLevel_15();
  }

  private native int PieceToExtent_16();
  public int PieceToExtent()
  {
    return PieceToExtent_16();
  }

  private native int PieceToExtentByPoints_17();
  public int PieceToExtentByPoints()
  {
    return PieceToExtentByPoints_17();
  }

  private native void SetSplitModeToBlock_18();
  public void SetSplitModeToBlock()
  {
    SetSplitModeToBlock_18();
  }

  private native void SetSplitModeToXSlab_19();
  public void SetSplitModeToXSlab()
  {
    SetSplitModeToXSlab_19();
  }

  private native void SetSplitModeToYSlab_20();
  public void SetSplitModeToYSlab()
  {
    SetSplitModeToYSlab_20();
  }

  private native void SetSplitModeToZSlab_21();
  public void SetSplitModeToZSlab()
  {
    SetSplitModeToZSlab_21();
  }

  private native int GetSplitMode_22();
  public int GetSplitMode()
  {
    return GetSplitMode_22();
  }

  private native long UPDATE_SPLIT_MODE_23();
  public vtkInformationIntegerRequestKey UPDATE_SPLIT_MODE()
  {
    long temp = UPDATE_SPLIT_MODE_23();

    if (temp == 0) return null;
    return (vtkInformationIntegerRequestKey)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  public vtkExtentTranslator() { super(); }

  public vtkExtentTranslator(long id) { super(id); }
  public native long   VTKInit();

}
